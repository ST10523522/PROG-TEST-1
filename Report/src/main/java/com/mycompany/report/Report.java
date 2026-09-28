/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.report;

/**
 *
 * @author Linda Baloyi ST10523522
 */
import java.util.Scanner;
public class Report {

    public static void main(String[] args) {
        String cities[] = {"Pretoria", "Johannesburg", "Cape town"};
        String consoles[] = {"PS5", "XBOX", "SWITCH"};
        int[][] sales ={ {1000, 2000, 1500}, 
                         {2000, 3000, 1100},
                         {3000, 4000, 1200},
    };
        
        System.out.println("-------------------------");
        System.out.println("Gaming Console Report");
        System.out.println("-------------------------");
        
        for(int i =0; i <sales.length; i++){
            for(int j = 0; j<sales.length; j++){
            }
        }
        
        System.out.println("----------------------------");
        System.out.println("Console Sales For each City");
        System.out.println("----------------------------");
        
        for(int i = 0; i< cities.length; i++){
             System.out.println("\nCity " + cities[i]);
            int total = 0;
            
        for(int j =0; j<sales[i].length; j++){
             System.out.println(consoles[j] + ": " + sales[i][j]);
             total = total + sales[i][j];
        }
        
         System.out.println("Total Sales: " +total);
           
        }
        
        
    }
}
