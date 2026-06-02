//package com.prathmesh.corejavamastery.map;
//
//import javax.print.attribute.HashPrintJobAttributeSet;
//import java.util.HashMap;
//
///*
//* Inventory Low Stock Alert
//Create:
//Product
//id
//name
//quantity
//Store products in a collection.
//Operations:
//Add product.
//Update stock. Using ID
//Search by id.
//Display products with stock below 5.
//Prevent duplicate product IDs.
//*/
//class Product{
//    int id;
//    String name;
//    int quantity;
//    Product(int id , String name , int quantity){
//        this.id = id;
//        this.name = name;
//        this.quantity = quantity;
//    }
//    Product(){}
//    @Override
//    public  String toString(){
//        return "Id:"+id+" Name:"+name+" Quantity:"+quantity;
//    }
//}
//public class InventoryLowStockAlert {
//
//    public static void main(String[] args) {
//
////    Add product.
//        HashMap<Integer,Product> productList = new HashMap<>();
//        productList.put(101, new Product(101,"Laptop",7));
//        productList.put(102, new Product(102,"Mouse",9));
//        productList.put(103, new Product(103,"Monitor",3));
//        productList.put(104, new Product(104,"Desk",3));
//        productList.put(105, new Product(105,"Mouse Pad",10));
//        System.out.println(new Product().toString());
////    Update stock.
//        //104 update stock +1
//        Product obj=productList.get(103);
//        obj.quantity+=1;
//        System.out.println(obj.toString());
//
////    Search by id. 105
//        Product obj2 = productList.get(105);
//        System.out.println(obj2.toString());
//
////    Display products with stock below 5.
//        for (Product product: productList.values()){
//            if (product.quantity < 5){
//                System.out.println(product.toString());
//            }
//        }
////    Prevent duplicate product IDs.
////        Product duplicateProduct= new Product(103,"Monitor",2);
////        if(productList.containsKey(duplicateProduct.id)){
////
////             productList.put(duplicateProduct.id,duplicateProduct.quantity+((productList.get(duplicateProduct.id).quantity));
////        }
//    }
//}
// This AI code i will learnign this tommorow understand it and then retry after few days
package com.prathmesh.corejavamastery.map;

import java.util.HashMap;

class Product {

    int id;
    String name;
    int quantity;

    public Product(int id, String name, int quantity) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Id: " + id +
                ", Name: " + name +
                ", Quantity: " + quantity;
    }
}

class InventoryService {

    private HashMap<Integer, Product> products =
            new HashMap<>();

    public void addProduct(Product product) {

        if (products.containsKey(product.id)) {

            System.out.println(
                    "Duplicate Product ID: "
                            + product.id);

            return;
        }

        products.put(product.id, product);
    }

    public void updateStock(
            int productId,
            int newQuantity) {

        Product product =
                products.get(productId);

        if (product == null) {

            System.out.println(
                    "Product not found.");

            return;
        }

        product.quantity = newQuantity;
    }

    public Product searchById(int productId) {

        return products.get(productId);
    }

    public void displayLowStockProducts() {

        System.out.println(
                "\nLow Stock Products:");

        for (Product product :
                products.values()) {

            if (product.quantity < 5) {

                System.out.println(product);
            }
        }
    }

    public void displayAllProducts() {

        System.out.println(
                "\nAll Products:");

        for (Product product :
                products.values()) {

            System.out.println(product);
        }
    }
}

public class InventoryLowStockAlert {

    public static void main(String[] args) {

        InventoryService service =
                new InventoryService();

        service.addProduct(
                new Product(101,
                        "Laptop",
                        7));

        service.addProduct(
                new Product(102,
                        "Mouse",
                        9));

        service.addProduct(
                new Product(103,
                        "Monitor",
                        3));

        service.addProduct(
                new Product(104,
                        "Desk",
                        2));

        service.addProduct(
                new Product(105,
                        "Mouse Pad",
                        10));

        // Duplicate ID test
        service.addProduct(
                new Product(103,
                        "Monitor",
                        5));

        // Update stock
        service.updateStock(
                104,
                8);

        // Search by ID
        Product product =
                service.searchById(105);

        if (product != null) {

            System.out.println(
                    "\nSearch Result:");

            System.out.println(product);
        }

        // Low stock products
        service.displayLowStockProducts();

        // Display all products
        service.displayAllProducts();
    }
}