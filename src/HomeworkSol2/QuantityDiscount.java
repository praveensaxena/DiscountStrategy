/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package HomeworkSol2;

/**
 *
 * @author Praveen Saxena
 */
public class QuantityDiscount implements DiscountStrategy {

    private int minQuantity = 2;
    private double discountPct = 0;
    // private static final int MIN_QUANTITY = 5;
    //  private static final double DISCOUNT_PERCENTAGE = 50;

    public QuantityDiscount(int minQty, double discPct) {
        this.minQuantity = minQty;
        this.discountPct = discPct;
    }

    public double getDiscountPct() {
        return discountPct;
    }

    public void setDiscountPct(double discountPct) {
        this.discountPct = discountPct;
    }

    @Override
    public double calculateDiscount(double price, int qty) {
        double discountAmt = 0;
        if (qty >= minQuantity) {
            discountAmt = (price * qty * (discountPct / 100));
        }
        return discountAmt;
    }
}
