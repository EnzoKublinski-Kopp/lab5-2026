import java.util.Random;
/**
 * Prints out stars for every hundred that can be subtracted from a random number 0-999
 *
 * @author Enzo Kublinski-Kopp
 * @version v1.0
 * @since 09/27/2026
 */
public class BarChart
{
   public static void main(String[] args){
       int num1, num2, num3;
       int num1Stars = 0, num2Stars = 0, num3Stars = 0;
       
       Random ran = new Random();
       
       num1 = ran.nextInt(1000);
       num2 = ran.nextInt(1000);
       num3 = ran.nextInt(1000);
       
       System.out.println("Number 1 is: " + num1);
       System.out.println("Number 2 is: " + num2);
       System.out.println("Number 3 is: " + num3);
       System.out.println();
       
       System.out.println("NUMBER BAR CHART");
       
       while (num1 > 99)
           {
               num1 -= 100;
               num1Stars++;
           }   
       while (num2 > 99)
           {
               num2 -= 100;
               num2Stars++;
           }  
       while (num3 > 99)
           {
               num3 -= 100;
               num3Stars++;
           }  
       
       System.out.print("Number 1: ");
       if (num1Stars == 0)
       System.out.print("<100 no stars");
       for (int i = 0; i < num1Stars; i++)
       {
        System.out.print("*");   
       }
       System.out.println();
        
       System.out.print("Number 2: ");
       if (num2Stars == 0)
       System.out.print("<100 no stars");
       for (int i = 0; i < num2Stars; i++)
       {
        System.out.print("*");   
       }
       System.out.println();
       
       System.out.print("Number 3: ");
       if (num3Stars == 0)
       System.out.print("<100 no stars");
       for (int i = 0; i < num3Stars; i++)
       {
        System.out.print("*");   
       }
   }
} 

