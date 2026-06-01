package com.prathmesh.corejavamastery.map;

import java.util.*;

/*Online Store Cart Analyzer
Cart contains:
Laptop
Mouse
Laptop
Keyboard
Mouse
Laptop
Monitor
Tasks:
Count quantity of each product.
Find most purchased product.
Remove products purchased only once.
Print remaining products.
* */
public class OnlineStoreCartAnalyzer {
    public static void main(String[] args) {
        String input="Laptop,Mouse,Laptop,Keyboard,Mouse,Laptop,Monitor";
        String[] productList=input.split(",");
        HashMap<String,Integer> productAndQuntityList=new HashMap<>();
        for (String product:productList){
            if (productAndQuntityList.containsKey(product)){
                productAndQuntityList.put(product,productAndQuntityList.get(product)+1);
            }
            else{
                productAndQuntityList.put(product,1);
            }
        }
        System.out.println("Product and Quntity :"+productAndQuntityList);
        int maxProductCnt=0;
        String maxPurchasedProduct="None";
        for (Map.Entry<String,Integer> map : productAndQuntityList.entrySet()){
            if (map.getValue() > maxProductCnt){
                maxProductCnt = map.getValue();
                maxPurchasedProduct = map.getKey();
            }
        }
        System.out.println("Most purchased product is : "+maxPurchasedProduct+" with quntity "+maxProductCnt);
        Iterator<Map.Entry<String, Integer>> iterator =
                productAndQuntityList.entrySet().iterator();

        while (iterator.hasNext()) {
            Map.Entry<String, Integer> entry = iterator.next();

            if (entry.getValue() == 1) {
                iterator.remove();
            }
        }
        System.out.println("Product and Quntity :"+productAndQuntityList);

    }
}
