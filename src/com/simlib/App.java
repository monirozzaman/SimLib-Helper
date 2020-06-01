/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.simlib;

import com.itvillage.Modem;
import java.util.Scanner;

/**
 *
 * @author monirozzamanroni
 */
public class App {
    
    private static int isRepeate;
    private static String activePort;
    
    public App()
    {
    activePort =Modem.getActiveModemPorts().get(0);
    }
    public static void main(String[] args) {
        new App();
        Scanner scanner= new Scanner(System.in);
        isRepeate = 1;
        
        while(isRepeate == 1){
        System.out.println("========= Menu ==========\n1. For Ussd Test\n2. For Modem Model Test\n==========================\nWhat is your Decison ?");
        int getDecisionFromUser = scanner.nextInt();
        if(getDecisionFromUser == 1)
        {
        System.out.println("------"+Modem.sendATCommand(activePort,"AT+CUSD=1,\"*222#\",15"));
        System.out.println("Can You Run Again ?");
        isRepeate = scanner.nextInt();
        }
         if(getDecisionFromUser == 2)
        {
         System.out.println("------"+Modem.sendATCommand(activePort,"AT+CGMI"));
         System.out.println("Can You Run Again ?");
         isRepeate = scanner.nextInt();
        }
        }
       
       
    }
    
}
