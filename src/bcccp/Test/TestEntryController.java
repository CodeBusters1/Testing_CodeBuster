/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bcccp.Test;

import bcccp.carpark.entry.EntryController;
import bcccp.carpark.CarSensor;
import bcccp.carpark.entry.EntryUI;
/**
 *
 * @author roshan
 */
public class TestEntryController {
    public static void main(String[] args){
        
//Creating object and testing log function
EntryController enCon = new EntryController();
enCon.log("Roshan Basnet");

//passing value to carEventDetected method to test the values
enCon.carEventDetected("Detect 001", true);

//check carevent detected idle status in entryController class 
enCon.carEventDetected("Detect 002", true);

//check careventDetected method status equals to false
enCon.carEventDetected("Detect 003", false);

//testing buttonPushed method
enCon.buttonPushed();

//test TicketInserted method
enCon.ticketInserted("AAA001");

//test NotifyCarparkEvent method
enCon.notifyCarparkEvent();

 CarSensor os = new CarSensor("CAR5", 1, 2);
 EntryUI ui = new EntryUI(1, 2);
 EntryController controller = new EntryController(carpark, entryGate, os, is, ui);
    controller.buttonPushed();
    controller.carEventDetected("CAR5", true);
    
    
    controller.ticketInserted("CAR5");
    //controller.ticketTaken();
    
    controller.ticketTaken();
    controller.notifyCarparkEvent();
    
    
 }
    
}
