/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Class8HomeWork;

import java.text.DateFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Praveen Saxena
 */
public class CashRegister {

    NumberFormat nf = NumberFormat.getCurrencyInstance();
    DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
    Date date = new Date();
    
    CustomerAdmin ca = new CustomerInArray();
    ProductAdmin pa = new ProductInArray();
    Receipt receit;
    

    // Add bunch of products at the startup
    public void createProducts() 
    {
        pa.addProducts();
    }

    // Add bunch of Customers at the startup
    public void createCustomer() //(int id, String name)
    {
        ca.addCustomer("1111", "Joe Smith");
        ca.addCustomer("2222", "Praveen Saxena");
        ca.addCustomer("3333", "Julie Franklin");
    }

    public void startNewSale(String customerNo) {
        //find the customer from customer repositary
        Customer c = ca.getCustomer(customerNo);

        //get the name of the Customer in String variable
        String name = c.getCustomerName();

        //Initialize receipt object and set the name of Customer in Receipt object
        receit = new Receipt(name);
    }

    public void scanProduct(String productID, int qty) {
        //initialize line item so that each item can be stored
        LineItem item = new LineItem();
        
        //Get product information
        Product p = pa.returnProduct(productID);
         
        // assign line item values
        item.setProdId(p.getProductID());
        item.setProdDesc(p.getProductDesc());
        item.setUnitPrice(p.getUnitPrice());
        item.setQuantity(qty);
        item.setDiscountAmt(p.getDiscount(qty));
        item.calcItemTotal();
        item.calcSubtotal();

        // assign each line item to receipt
        receit.setItems(item);
    }

    public void finalizeSale() {
        double grandTotal = 0;
        double totalDiscount = 0;
        
        System.out.println("**************** RECEIPT *******************");
        System.out.println("      Wolly World Department Store");
        System.out.println("         " + dateFormat.format(date));
        System.out.println("********************************************");
        System.out.println("Customer : " + receit.getCustName());
        System.out.println("");
        System.out.println("Item    Desc         UnitPrice  Qty       Total  Discount  SubTotal");
        System.out.println("-------------------------------------------------------------------");
        for(LineItem l: receit.items ){
            System.out.format("%-8s%-13s%9s%5s%12s%10s%10s", 
                    l.getProdId(),
                    l.getProdDesc(),
                    nf.format(l.getUnitPrice()),
                    l.getQuantity(),
                    nf.format(l.getItemTotal()),
                    nf.format(l.getDiscountAmt()),
                    nf.format(l.getSubtotal())
                    );
            System.out.println("");
            grandTotal += l.getSubtotal();
            totalDiscount += l.getDiscountAmt();
        }
        System.out.println("-------------------------------------------------------------------");
        System.out.println("Grand Total : " + nf.format(grandTotal));
        System.out.println("Your total Savings : " + nf.format(totalDiscount));
    }
}
