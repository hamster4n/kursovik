package kursovik.utils;

import kursovik.customer.Customer;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Hamster4n.
 */
public class CustomerIOUtils {
    public static final String CSV_DELIMETR = ";";

    private CustomerIOUtils() {
    }

    // открываем файл и передаём на метод чтения ВСЕХ строк
    public static List<Customer> readCustomersFromFile(String FILE_NAME) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))) {
            return readCustomers(reader);
        }
    }

    //чтение всех строк из символьного файла
    public static List<Customer> readCustomers(BufferedReader reader) throws IOException {
        List<Customer> customers = new ArrayList<>();
        String line;
        while ((line = reader.readLine()) != null) {
            Customer customer = parseCustomerFromCsv(line);
            if (customer != null) {
                customers.add(customer);
            }
        }
        return customers;
    }

    //преобразование из csv в Customer

    public static Customer parseCustomerFromCsv(String s) {
        if (s == null || s.isEmpty()) {
            return null;
        }
        String[] tokens = s.split(CSV_DELIMETR);

        int customerID = Integer.parseInt(tokens[0]);
        String customerName = tokens[1];
        String customerAdress = tokens[2];
        String customerPhone = tokens[3];
        return new Customer(customerID, customerName, customerAdress, customerPhone);
    }

    //запись в символьный файл

    //преобразование из Product в csv
    public static String convertCustomerToCsv(Customer customer) {
        return customer.getCustomerID() + CSV_DELIMETR + customer.getCustomerName() + CSV_DELIMETR +
                customer.getCustomerAdress() + CSV_DELIMETR + customer.getCustomerPhone();
    }

    ///// запись в файл csv

    // создаём файл и передаём на заполнение множеством строк customers
    public static void outputCustomersIntoFile(List<Customer> customers, String fileName) throws IOException {
        try (PrintWriter writer = new PrintWriter(new FileWriter(fileName))) {
            outputCustomers(customers, writer);
        }
    }

    // заполнение файла одним customer в строку csv
    public static void outputCustomer(Customer customer, PrintWriter writer) {
        writer.println(convertCustomerToCsv(customer));
    }

    // заполнение файла списком customers в файл csv
    public static void outputCustomers(List<Customer> customers, PrintWriter writer) {
        for (Customer customer : customers) {
            outputCustomer(customer, writer);
        }
    }

}
