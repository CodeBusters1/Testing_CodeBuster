/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bcccp.tickets.adhoc;

/**
 *
 * @author 
 */
public class TestAdhocTicket{
    public static void main(String[] args){
        /** printing the main**/        
        System.out.println("This is Testing TestAdhocTicket main before testing....");
        /** Creating the instance of AdhocTicket**/
        AdhocTicket ticket = new AdhocTicket("0", 113, "A6A09E667F3BCD 2011-12-8,22:13:30.0"); 
        /** Testing CarParkId if the id is null or zero**/
        
      
        AdhocTicket test3 = new AdhocTicket("Glenroy001", 113, "0"); 
        System.out.println("RuntimeException if the barcode number is less than or equal to zero "+ test3.getBarcode());
          
    }
}
