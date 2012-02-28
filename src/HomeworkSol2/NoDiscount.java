/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package HomeworkSol2;

/**
 *
 * @author Praveen Saxena
 */
public class NoDiscount implements DiscountStrategy {
    
    private double disount_amt = 0;
    

    @Override
    public double calculateDiscount(double price, int qty) {
        return this.disount_amt;
    }
    
}
