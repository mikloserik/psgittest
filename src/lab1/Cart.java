/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

/**
 *
 * @author Student
 */

import java.util.*;
public class Cart {
    private HashMap<Product, Integer> products = new HashMap<Product, Integer>();
    
    public Cart(){
       
    }
    
    public void addProduct(Product p, int quantity){
        products.put(p, quantity);
    }
    
    public double getTotalPrice(){
        double price = 0f;
        
        for (Map.Entry<Product, Integer> entry : products.entrySet()) {
            price += entry.getKey().getPrice(entry.getValue());
        }
        
        return price;
    }
    
    @Override public String toString(){
        String s = "";
        for (Map.Entry<Product, Integer> entry : products.entrySet()) {
            s = s + entry.getKey().toString() + ", ";
        }
        return s;
    }
}
