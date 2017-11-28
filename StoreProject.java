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
      double quantity = 0;                                     // quantity of item ordered
      double quantity2 = 0;                                    // quantity of item ordered
      double quantity3 = 0;                                    // quantity of item ordered
      double quantity4 = 0;                                    // quantity of item ordered
      double quantity5 = 0;                                    // quantity of item ordered
      double quantity6 = 0;                                    // quantity of item ordered
      double quantity7 = 0;                                    // quantity of item ordered
      double quantity8 = 0;                                    // quantity of item ordered
      double quantity9 = 0;                                    // quantity of item ordered
      double quantity10 = 0;
                             
      double subtotal = 0.0;                                   // subtotal of customer's purchase                      
      double taxAmount = 0.0;                                  // total amount of tax                  
      double totalCost = 0.0;                                  // total cost of purchase                     
      final double TAX_RATE = 0.05999;                         // tax rate
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
      UserOrder.userOrder();
      
      
   
      
      /*
      System.out.println("Enter The Number Of Random Portraits ");
      quantity = keyboard.nextDouble();
      keyboard.nextLine();    // get rid of hidden \n in the keyboard buffer
      
      System.out.println("Enter The Number Of Custom Portraits ");
      quantity2 = keyboard.nextDouble();
      keyboard.nextLine();    // get rid of hidden \n in the keyboard buffer

      System.out.println("Enter The Number Of Custom Portrait Paintings ");
      quantity3 = keyboard.nextDouble();
      keyboard.nextLine();    // get rid of hidden \n in the keyboard buffer
      
      
      
      
      
      
      System.out.println("Enter The Number Of Landscape Pictures ");
      quantity4 = keyboard.nextDouble();
      keyboard.nextLine();    // get rid of hidden \n in the keyboard buffer
      
      System.out.println("Enter The Number Of Landscape Paintings ");
      quantity5 = keyboard.nextDouble();
      keyboard.nextLine();    // get rid of hidden \n in the keyboard buffer
      
      System.out.println("Enter The Number Of Custom Landscape Pictures ");
      quantity6 = keyboard.nextDouble();
      keyboard.nextLine();    // get rid of hidden \n in the keyboard buffer
      
      System.out.println("Enter The Number Of Custom Landscape Paintings ");
      quantity7 = keyboard.nextDouble();
      keyboard.nextLine();    // get rid of hidden \n in the keyboard buffer
      
      System.out.println("Enter The Number Of Large Round Brushes ");
      quantity8 = keyboard.nextDouble();
      keyboard.nextLine();    // get rid of hidden \n in the keyboard buffer
      
      System.out.println("Enter The Number Of Medium Round Brushes ");
      quantity9 = keyboard.nextDouble();
      keyboard.nextLine();    // get rid of hidden \n in the keyboard buffer
      
      System.out.println("Enter The Number Of Small Round Brushes ");
      quantity10 = keyboard.nextDouble();
      keyboard.nextLine();    // get rid of hidden \n in the keyboard buffer
      */
      
      // ******************************* computations
      subtotal = quantity * RANDOM_PORTRAIT_PRICE + quantity2 * CUSTOM_PORTRAIT_PRICE + 
      quantity3 * CUSTOM_PORTRAIT_PAINTING + quantity4 * LANDSCAPE_PIC_PRICE + quantity5 * LANDSCAPE_PAINTING_PRICE +                  // Gets the sumtotal of all the objects the user would like to buy
      quantity6 * CUSTOM_LANDSCAPE_PIC_PRICE + quantity7 * CUSTOM_LANDSCAPE_PAINTING_PRICE  + quantity8 * LARGE_ROUND_BRUSH_PRICE + 
      quantity9 * MEDIUM_ROUND_BRUSH_PRICE + quantity10 * SMALL_ROUND_BRUSH_PRICE;
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

class UserOrder
{
   public static void userOrder()
   {
      Scanner keyboard2 = new Scanner(System.in);               // reads user input
      System.out.println("\nWhat would you like to purchase today?");
      String userInput = "";
      userInput = keyboard2.nextLine();
      userInput = userInput.toLowerCase(); 
      System.out.println(userInput);///////////////////////////////////////////////////////////////////////////////////
      boolean foundWord = false;
      
      String[] randomWords = {"random portait", "random portrait.", "random portraits", "random portraits.", "test"};
      
      for (int i = 0; i < randomWords.length; i++)
      {
      
System.out.println("*" + userInput + "*   ?=   %" + randomWords[i] + "%");
         if (userInput.indexOf(randomWords[i]) >= 0)
         {
            System.out.println("We found it!");
            foundWord = true;
            break;
         }

      
      }
   
      if (!foundWord)
      {
         System.out.println("We are sorry, but your order cannot be completed at this time.");
      }
   
   
   }// end of method  ??


}// end of class ?