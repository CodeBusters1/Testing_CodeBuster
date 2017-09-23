/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bcccp.tickets.season;

/**
 *
 * @author Rabin Bhattrai
 */
public class TestSeasonTicket {
    
     public static void main(String[] args){
        /** printing the main**/        
        System.out.println("This is Testing TestSeasonTicket main before testing....");
        /** Creating the instance of SeasonTicket**/
       SeasonTicket ticket = new SeasonTicket("S0011","CP3",12022017,120320170 ); 
        /** printing the getter Ticket Id And Car park  method**/
        //System.out.println("Unique Season Ticket Id is: "+ ticket.getId());     
        //System.out.println("Unique CarParkId is: "+ ticket.getCarparkId()); 
        
        System.out.println("Throwing an exception when season ticket id is null ");
        SeasonTicket ticket1 = new SeasonTicket("0","CP3",12022017,120320170);
        System.out.println("Unique Season Ticket Id is: "+ ticket1.getId());
        
        System.out.println("Throwing an exception when carpark name is null ");
        SeasonTicket ticket2 = new SeasonTicket("S00112","",12022017,120320170);

        System.out.println("Unique CarParkId is: "+ ticket2.getCarparkId()); 

        
    }
}
