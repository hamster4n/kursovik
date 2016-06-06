package kursovik;

import kursovik.customer.Customer;
import kursovik.utils.CustomerIOUtils;


import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Hamster4n.
 */
public class RunnerCustomer {
    public static final String FILE_NAME = "c:/Java/MyProjects/JavaOOP/src/kursovik/Customers.csv";


    public static void main(String[] args) {

        //тест1. читаем из файла в список - пройден
        List<Customer> customers = new ArrayList<>();
        try {
            customers = CustomerIOUtils.readCustomersFromFile(FILE_NAME);
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(customers);


        //тест2. удаляем учётную запись, добавляем 2 учётых записи и записываем результат в файл - пройден
        customers.remove(2);
        customers.add(new Customer(6,"Семечкин Семён Сидорович","г.Караганда","380667451278"));
        customers.add(new Customer(7,"Юрин Юрий Юрьевич","с.Дальний Устюг","380934781278"));
        System.out.println(customers);
        try {
            CustomerIOUtils.outputCustomersIntoFile(customers,FILE_NAME);
        } catch (IOException e) {
            e.printStackTrace();
        }


    }


}

