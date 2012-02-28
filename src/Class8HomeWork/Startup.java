/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Class8HomeWork;

/**
 *
 * @author Praveen Saxena
 */
public class Startup {

    public static void main(String[] args) {

        CashRegister cashRegister = new CashRegister();

        //create some Customers and Products
        cashRegister.createProducts();
        cashRegister.createCustomer();

        cashRegister.startNewSale("2222");
        
        cashRegister.scanProduct("11", 6);
        cashRegister.scanProduct("33", 5);
        cashRegister.scanProduct("44", 4);
        cashRegister.scanProduct("22", 2);
        cashRegister.scanProduct("55", 1);
        
        
        cashRegister.finalizeSale();
    }
}
