import java.util.*;
import java.io.*;
/**
* The purpose of code is to convert all number to String (word)
* In the Driver will let user enter the number in and and hold object from another class
*/
public class DriverIntToWord {
   public static void main(String[] args){
   
   int number;
   char input;
   String enter;
   
   
   Scanner kb = new Scanner (System.in);
   IntToWord obj = new IntToWord();
   
   
   
   
   
   do{
      do{
      System.out.println("Please enter a number ( 1- 999): ");
      number = kb.nextInt();
      }while(number < 0 || number > 999);
      System.out.println("Word: " + obj.converter(number));
      
      
      
      System.out.println("Do you want to run program again ? (y: yes | n: no) ");
      input = kb.next().toLowerCase().charAt(0);
      //input = enter.charAt(0).toLowerCase();
   }while (input != 'n');
   
   System.out.println("Program is closed !!!");
   
   }// end main

}// end class