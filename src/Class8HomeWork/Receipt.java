/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Class8HomeWork;

/**
 *
 * @author Praveen Saxena
 */
public class Receipt {
    private String custName;
    private double saleTotal;
    private double subTotal;
    LineItem [] items = {};

    public Receipt(String custName) {
        this.custName = custName;
    }

    public String getCustName() {
        return custName;
    }

    public LineItem[] getItems() {
        return items;
    }

    public void setItems(LineItem item) {
        LineItem[] temp = new LineItem[items.length + 1];
        System.arraycopy(items, 0, temp, 0, items.length);
        temp[temp.length-1] = item;
        items = temp;
        
    }

    public double getSaleTotal() {
        return saleTotal;
    }

    public void setSaleTotal(double saleTotal) {
        this.saleTotal = saleTotal;
    }

    public double getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(double subTotal) {
        this.subTotal = subTotal;
    }
    
    
}
