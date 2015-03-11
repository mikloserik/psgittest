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
public abstract class Product {
    private String name;
    private double price;
    
    public Product (){
    }
    
    public abstract double getPrice(int quantity);
    
    @Override
    public abstract String toString(); 
    
    public void setName(String name){
        this.name = name;
    }
    
    public void setPrice(double price){
        this.price = price;
    }
    
    public double getPrice(){
        return price;
    }
    
    public String getName(){
        return name;
    }
}
