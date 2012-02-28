/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Class8HomeWork;

/**
 *
 * @author Praveen Saxena
 */
public class LineItem {

    private String prodId;
    private String prodDesc;
    private int quantity;
    private double unitPrice;
    private double itemTotal;
    private double discountAmt;
    private double subtotal;

    public double getDiscountAmt() {
        return discountAmt;
    }

    public final void setDiscountAmt(double discountAmt) {
        this.discountAmt = discountAmt;
    }

    public final double getItemTotal() {
        return itemTotal;
    }

    public final void calcItemTotal() {
        itemTotal = (unitPrice * quantity);
    }

    public final String getProdDesc() {
        return prodDesc;
    }

    public final void setProdDesc(String prodDesc) {
        this.prodDesc = prodDesc;
    }

    public final String getProdId() {
        return prodId;
    }

    public final void setProdId(String prodId) {
        this.prodId = prodId;
    }

    public final int getQuantity() {
        return quantity;
    }

    public final void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public final double getSubtotal() {
        return subtotal;
    }

    public final void calcSubtotal() {
        subtotal = (itemTotal - discountAmt);
    }

    public final double getUnitPrice() {
        return unitPrice;
    }

    public final void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }
    
    
}
