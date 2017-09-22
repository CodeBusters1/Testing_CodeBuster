/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bcccp.tickets.adhoc;

/**
 *
 * @author Suyog Rajbhandari
 */
public class TestAdhocTicket{
    public static void main(String[] args){
        /** printing the main**/        
        System.out.println("This is Testing TestAdhocTicket main before testing....");
        /** Creating the instance of AdhocTicket**/
        AdhocTicket ticket = new AdhocTicket("Glenroy001", 113, "A6A09E667F3BCD 2011-12-8,22:13:30.0"); 
        /** printing the getter TicketNo method**/
        System.out.println("Unique CarParkId is: "+ ticket.getTicketNo());     
        System.out.println("Unique CarParkId is: "+ ticket.getTicketNo());     
    }
}
