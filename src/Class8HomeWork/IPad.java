/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Class8HomeWork;

/**
 *
 * @author Praveen Saxena
 */
public class IPad extends Product
{
    private static final double MIN_IPAD_PRICE = 350;
    private static final double MAX_IPAD_PRICE = 800;
    private static final String IPAD_PRICE_ERR = "Shoe price must be between $"
            + MIN_IPAD_PRICE + " and $" + MAX_IPAD_PRICE;

    public IPad(String id, String desc, double price) {
        setProductID(id);
        setProductDesc(desc);
        setUnitPrice(price);
        discount = new NoDiscount();
    }

    @Override
    public final void setUnitPrice(double price) {
        if (price < MIN_IPAD_PRICE || price > MAX_IPAD_PRICE) {
            throw new IllegalArgumentException(IPAD_PRICE_ERR);
        }
        unitPrice = price;
    }
}
