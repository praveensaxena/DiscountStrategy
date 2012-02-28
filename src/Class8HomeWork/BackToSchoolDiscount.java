/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Class8HomeWork;

/**
 *
 * @author Praveen Saxena
 */
public class BackToSchoolDiscount implements DiscountStrategy{
    private double discount_amt;
    private static final double DISCOUNT_PERCENTAGE = 25;

    @Override
    public double calculateDiscount(double price, int qty) {
        discount_amt = (price * qty * (DISCOUNT_PERCENTAGE/100));
        return this.discount_amt;
    }
    
    
}
