/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Class8HomeWork;

/**
 *
 * @author Praveen Saxena
 */
public class Shoe extends Product {

    private static final double MIN_SHOE_PRICE = 5;
    private static final double MAX_SHOE_PRICE = 200;
    private static final String SHOE_PRICE_ERR = "Shoe price must be between $"
            + MIN_SHOE_PRICE + " and $" + MAX_SHOE_PRICE;

    public Shoe(String id, String desc, double price) {
        setProductID(id);
        setProductDesc(desc);
        setUnitPrice(price);
        discount = new BackToSchoolDiscount();
    }

    @Override
    public final void setUnitPrice(double price) {
        if (price < MIN_SHOE_PRICE || price > MAX_SHOE_PRICE) {
            throw new IllegalArgumentException(SHOE_PRICE_ERR);
        }
        unitPrice = price;
    }
}
