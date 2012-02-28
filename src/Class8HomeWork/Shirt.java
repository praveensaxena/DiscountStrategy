/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Class8HomeWork;

/**
 *
 * @author Praveen Saxena
 */
public class Shirt extends Product{

    private static final double MIN_SHIRT_PRICE = 0;
    private static final double MAX_SHIRT_PRICE = 100;
    private static final String SHIRT_PRICE_ERR = "Shirt price must be between $"
            + MIN_SHIRT_PRICE + " and $" + MAX_SHIRT_PRICE;
            
    public Shirt(String id, String desc, double price)
    {
        setProductID(id);
        setProductDesc(desc);
        setUnitPrice(price);
        discount = new QuantityDiscount(); 
    }
    

    @Override
    public final void setUnitPrice(double price)
    {
        if (price < MIN_SHIRT_PRICE || price > MAX_SHIRT_PRICE)
        {
            throw new IllegalArgumentException(SHIRT_PRICE_ERR);
        }
        unitPrice = price;
    }
    
}
