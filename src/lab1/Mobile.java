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
public class Mobile extends Product{
    private String memory;
    private String os;
    
    public Mobile(String name, double price, String memory, String os){
        this.memory = memory;
        this.os = os;
        super.setName(name);
        super.setPrice(price);
    }
    
    @Override
    public String toString(){
        return super.getName() + " " + super.getPrice() + " " + " " + memory + " " + os; 
    }
    
    @Override
    public double getPrice(int quantity){
        double price;
        
        if(quantity > 20) price = (quantity * super.getPrice()) % 80;
        else price = quantity * super.getPrice();
        
        return price;
    }
}
