/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.newp1;
import java.util.Scanner;

/**
 *
 * @author omar
 */
public class Newp1 {

    public static void main(String[] args) {
      Scanner input = new Scanner (System.in);
      int length, width;
      int area;
      System.out.println("Enter rectangle length");
      length = input.nextInt();
      System.out.println("Enter rectangle width");
      width = input.nextInt();
      area = length * width;
              System.out.println(area);
      
              
    }
}
