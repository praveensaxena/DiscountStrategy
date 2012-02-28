/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Class8HomeWork;

/**
 *
 * @author Praveen Saxena
 */
public class QuantityDiscount implements DiscountStrategy{
    private double discount_amt = 0;
    private static final int MIN_QUANTITY = 5;
    private static final double DISCOUNT_PERCENTAGE = 50;

    @Override
    public double calculateDiscount(double price, int qty) {
        if (qty >= MIN_QUANTITY) {
            discount_amt = (price * qty * (DISCOUNT_PERCENTAGE/100));
        }
        return this.discount_amt;
    }

    
}
