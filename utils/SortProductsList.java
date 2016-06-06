//*
* наковырял на коленке сортировку по имени и по цене.
* думаю, что надо под каждый вид сортировки отдельный метод писать. 
* 
* берем данные о товарах из ProductsList
*

 class SortedByName implements Comparator<Product> {
      
       public int compare(Product obj1, Product obj2) {
            
             String str1 = obj1.getName();
             String str2 = obj2.getName();
            
             return str1.compareTo(str2);
        }
}
========


 class SortedByPrice implements Comparator<Product> {
      
       public int compare(Product obj1, Product obj2) {
            
             int price1 = obj1.getPrice();
             int price2 = obj2.getPrice();

             if(price1 > price2) {
                    return 1;
             }
             else if(price1 < price2) {
                    return -1;
             }
             else {
                    return 0;
             }
       }
}

==========
 public class SortProductsList {      
          
             System.out.println("without sort");
            
             for(Product i : p) {
                    System.out.println("Name: " + i.getName() + " price: " + i.getPrice() + " quantity: " + i.getQuantity());
             }
            

             System.out.println("sort price");

             Arrays.sort(p, new SortedByPrice());
            
             for(Product i : p) {
                    System.out.println("Name: " + i.getName() + " price: " + i.getPrice() +
" quantity: " + i.getQuantity());
             }     


             System.out.println("sort name");
            
             Arrays.sort(p, new SortedByName());
             for(Product i : p) {
                    System.out.println("Name: " + i.getName() + " price: " + i.getPrice() + " quantity: " + i.getQuantity());
             }
       }

}
