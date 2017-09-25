/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bcccp.Test;
import bcccp.carpark.exit.ExitController;

/**
 *
 * @author roshan
 */
public class ExitControllerTest {

public static void main(String [] args){
         
         
        ExitController exit=new ExitController();
        
        //test carEventDetected
        exit.carEventDetected("A1562", true);    
}
}
