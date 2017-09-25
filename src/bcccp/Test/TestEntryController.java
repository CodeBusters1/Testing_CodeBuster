/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bcccp.Test;

import bcccp.carpark.entry.EntryController;
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
    
 }
    
}
