/*
   Store Project 
   @author Michael Imbesi
*/

import java.util.Scanner;
import java.util.Random;
import java.awt.Color;

public class StoreProject
{
   public static void main(String[] args)
   {
      Scanner keyboard = new Scanner(System.in);               // reads user input
      double quantity = 0;                                    // quantity of item ordered                        
      double subtotal = 0.0;                                  // subtotal of customer's purchase                      
      double taxAmount = 0.0;                                 // total amount of tax                  
      double totalCost = 0.0;                                 // total cost of purchase                     
      final double TAX_RATE = 0.06999;                         // tax rate
      //prices of photos and paintings
      final double RANDOM_PORTRAIT_PRICE = 10.0;               // price per portrait of random person              
      final double CUSTOM_PORTRAIT_PRICE = 15.0;               // price per custom portrait photo
      final double CUSTOM_PORTRAIT_PAINTING = 50.0;            // price per custom portrait painting
      final double LANDSCAPE_PIC_PRICE = 20.0;                 // price per landscape photo
      final double LANDSCAPE_PAINTING_PRICE = 30.0;            // price per landscape painting
      final double CUSTOM_LANDSCAPE_PIC_PRICE = 50.0;          // price per custom landscape photo
      final double CUSTOM_LANDSCAPE_PAINTING_PRICE = 75.0;     // price per custom landscape painting
      // prices of brushes available for purchase
      final double LARGE_ROUND_BRUSH_PRICE = 5.0;              // price per large round brush
      final double MEDIUM_ROUND_BRUSH_PRICE = 3.0;             // price per medium round brush
      final double SMALL_ROUND_BRUSH_PRICE = 2.0;              // price per small round brus
   

      // ******************************* user inputs
      displayStoreTitle();
      System.out.print("################# Enter ##################");
      quantity = keyboard.nextDouble();
      keyboard.nextLine();    // get rid of hidden \n in the keyboard buffer
      
      // ******************************* computations
      subtotal = quantity * RANDOM_PORTRAIT_PRICE + CUSTOM_PORTRAIT_PRICE + 
      CUSTOM_PORTRAIT_PAINTING + LANDSCAPE_PIC_PRICE + LANDSCAPE_PAINTING_PRICE + 
      CUSTOM_LANDSCAPE_PIC_PRICE + CUSTOM_LANDSCAPE_PAINTING_PRICE  + LARGE_ROUND_BRUSH_PRICE + 
      MEDIUM_ROUND_BRUSH_PRICE + SMALL_ROUND_BRUSH_PRICE;
      taxAmount = computeTax(subtotal, TAX_RATE);

      totalCost = subtotal + taxAmount;
		
      // ******************************* display the output
      System.out.println("You owe $" + totalCost);
   }
   public static void displayStoreTitle()
   {
      System.out.println("***********************");
      System.out.println("** MICHAELS ART SHOP **");
      System.out.println("***********************");
   }// end of displayStoreTitle
   
   public static double computeTax(double amount, double taxRate)
   {
      return amount * taxRate;
   }// end of computeTax   
} 