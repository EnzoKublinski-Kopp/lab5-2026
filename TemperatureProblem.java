import java.util.Scanner;

/**
 * Converts a temperature given by user from celsius to fahrenheit or vice versa
 *
 * @author Enzo Kublinski-Kopp
 * @version v1.0
 * @since 09/27/2026
 */
public class TemperatureProblem
{
   public static void main(String[] args){
       String inputStr;
       String yesOrNo;
       char cOrF;
       double temp, convertedTemp;
       boolean keepGoing = true;
       
       Scanner keyboard = new Scanner(System.in);
       
       do
       {
           System.out.print("Enter a whole number, a space, and C or F (ie 100 F converts to Cels): ");
           temp = keyboard.nextDouble();
           inputStr = keyboard.next();
           cOrF = inputStr.charAt(0);
           
           while (cOrF != 'c' && cOrF != 'C' && cOrF != 'f' && cOrF != 'F')
           {
               System.out.print("Enter C to convert to F or vice versa: ");
               inputStr = keyboard.next();
               cOrF = inputStr.charAt(0);
           }
           
           if (cOrF == 'f' || cOrF == 'F')
           {
               convertedTemp = ((temp - 32) * (5.0 / 9));
               System.out.printf("%.0fF converted is: %.1fC\n", temp, convertedTemp);
           }
           else
           {
               convertedTemp = (temp * (9.0 / 5)) + 32;
               System.out.printf("%.0fC converted is: %.1fF\n", temp, convertedTemp);
           }
           
           do {
               System.out.print("Do you want to calculate another temp? If so, enter yes otherwise no: ");
               yesOrNo = keyboard.next();
                   
               if (yesOrNo.equalsIgnoreCase("no"))
               {
                   keepGoing = false;
               }
               
           } while (!(yesOrNo.equalsIgnoreCase("yes") || yesOrNo.equalsIgnoreCase("no")));
           
       } while (keepGoing);
       
       keyboard.close();
   }
}