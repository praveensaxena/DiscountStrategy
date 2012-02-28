/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Class8HomeWork;

/**
 *
 * @author Praveen Saxena
 */
public interface DiscountStrategy {
    
    public abstract double calculateDiscount(double price, int qty);
    
}
