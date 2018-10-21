public class IntToWord{


   private String str;   
   private boolean condition;

   public String oneToHundred(int num){
      str = "";
      condition = true;
      while(condition){
      
         if (num == 1){
            str = str + "One";
            condition = false;
         }else if (num == 2){
            str = str + "Two";
            condition = false;    
         }else if (num == 3){
            str = str + "Three";
            condition = false;    
         }else if (num == 4){
            str = str + "four";
            condition = false;    
         }else if (num == 5){
            str = str + "Five";
            condition = false;    
         }else if (num == 6){
            str = str + "Six";
            condition = false;    
         }else if (num == 7){
            str = str + "Seven";
            condition = false;    
         }else if (num == 8){
            str = str + "Eight";
            condition = false;    
         }else if (num == 9){
            str = str + "Nine";
            condition = false;    
         }else if (num == 10){
            str = str + "Ten";
            condition = false;    
         }else if (num == 11){
            str = str + "Eleven";
            condition = false;    
         }else if (num == 12){
            str = str + "Twelve";
            condition = false;    
         }else if (num == 13){
            str = str + "Thirteen";
            condition = false;    
         }else if (num == 14){
            str = str + "fourteen";
            condition = false;    
         }else if (num == 15){
            str = str + "fifteen";
            condition = false;    
         }else if (num == 16){
            str = str + "sixteen";
            condition = false;    
         }else if (num == 17){
            str = str + "seventeen";
            condition = false;    
         }else if (num == 18){
            str = str + "eighteen";
            condition = false;    
         }else if (num == 19){
            str = str + "nineteen";
            condition = false;    
         }else if (num >= 20 && num < 30){
            str = str + "Twenty ";
            num = num - 20;
            condition = true;    
         }else if (num >= 30 && num < 40){
            str = str + "Thirty ";
            num = num - 30;
            condition = true;    
         }else if (num >= 40 && num < 50){
            str = str + "Fourty ";
            num = num - 40;
            condition = true;    
         }else if (num >= 50 && num < 60){
            str = str + "Fifty ";
            num = num - 50;
            condition = true;    
         }else if (num >= 60 && num < 70){
            str = str + "Sixty ";
            num = num - 60;
            condition = true;    
         }else if (num >= 70 && num < 80){
            str = str + "Seventy ";
            num = num - 70;
            condition = true;    
         }else if (num >= 80 && num < 90){
            str = str + "Eighty ";
            num = num - 80;
            condition = true;    
         }else if (num >= 90 && num < 100){
            str = str + "NineTy ";
            num = num - 90;
            condition = true;    
         }     
      
      
      }
      
      return str;
   } //end method convert number 
   
   public String converter(int n){
      str = "";
      condition = true;
      while(condition){
         if(n >= 1 && n < 100){
            str = str + oneToHundred(n);
            condition = false; 
         }else if (n >= 100 && n < 1000){
            str = str + oneToHundred(n / 100);
            str = str + "Hundred ";
            n = n % 100;
            condition = true;         
         }
      
      }
      return str;
   
   }//end conveter method
   
  


}