/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Class8HomeWork;

/**
 *
 * @author Praveen Saxena
 */
public class ProductInArray implements ProductAdmin {

    Product[] products = {};

    @Override
    public void addProducts()
    {
        Product shirt       = new Shirt("11", "Shirt", 20.0);
        Product poloShirt   = new Shirt("22", "PoloShirt", 25.0);
        poloShirt.setDiscountStrategy(new BackToSchoolDiscount());
        Product shoe        = new Shoe("33", "Shoe", 80.0);
        Product sandel      = new Shoe("44", "Sandles", 120.0);
        Product iPad        = new IPad("55", "IPad", 500);

        Product[] prodList = {shirt, poloShirt, shoe, sandel, iPad};
        products = prodList;
    }

    @Override
    public Product returnProduct(String id) {
        Product p = null;
        for (int i = 0; i < products.length; i++) {
            if (products[i].getProductID().equalsIgnoreCase(id)) {
                p = products[i];
                break;
            }
        }
        return p;
    }

    // FOR FUTURE USE
    @Override
    public void updateProduct(String id, double price) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void removeProduct(String id) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
