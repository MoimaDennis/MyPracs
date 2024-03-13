/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ecadiproject1;
import java.util.Scanner;
/**
 *
 * @author RC_Student_lab
 */
public class Ecadiproject1 {

    public static void main(String[] args) {
       /*
        System.out.println("My name is Dennis");
        String name = "Dennis";
        System.out.println(name); 
      */
       Scanner scanner = new Scanner (System.in);
       System.out.print("Please enter your age");
      //tring FirstName = scanner()
      Double age = scanner.nextDouble();
      scanner.close();
      System.out.println("My age is" + age);//the use of the + sign is called concatenation
    }
}
