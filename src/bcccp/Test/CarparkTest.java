/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bcccp.Test;
import bcccp.carpark.Carpark;
/**
 *
 * @author roshan
 */
public class CarparkTest {
    public static void main(String [] args){
        
        //Test carpark class get name method
            Carpark cCon=new Carpark();
            String c=cCon.getName();
            System.out.println(c);
            
            //Test calculateAddHocTicketCharge method
            float charge=cCon. calculateAddHocTicketCharge(23);
            System.out.println(charge);
            
            //test isSeasonTicketValid method
            boolean state=cCon.isSeasonTicketValid("012356");
           System.out.println(state);
    
}
}