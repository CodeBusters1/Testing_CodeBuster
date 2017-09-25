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
public class TestAdhocTicketFactory {
    
    public static void main(String[] args){
        
        // creating object of AdhocTicketFactory
        AdhocTicketFactory Adhoc_TicketFactory = new AdhocTicketFactory();
        // printing the make method by passing carParkId and ticket no
        System.out.print(Adhoc_TicketFactory.make("glenroy", 12));
    }
}
