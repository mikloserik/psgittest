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
public class Laptop extends Product{
    private String processor;
    private String screenSize;
    private int ram;
    
    public Laptop(String name, double price, String screenSize, String processor){
        this.processor = processor;
        this.screenSize = screenSize;
        super.setName(name);
        super.setPrice(price);
    }
    
    @Override
    public String toString(){
        return super.getName() + " " + super.getPrice() + " " + processor + " " + screenSize; 
    }
    
    @Override public double getPrice(int quantity){
        double price;
        
        if(quantity > 10) price = (quantity * super.getPrice()) % 80;
        else price = quantity * super.getPrice();
        
        return price;
    }
}
