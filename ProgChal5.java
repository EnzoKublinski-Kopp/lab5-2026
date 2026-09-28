import java.util.Scanner;
/**
 * Finds number of a particular character in a string
 *
 * @author Enzo Kublinski-Kopp
 * @version v1.0
 * @since 09/27/2026
 */
public class ProgChal5
{
   public static void main(String[] args){
       String str, inputChar;
       char assessed;
       int count = 0;
       
       Scanner keyboard = new Scanner(System.in);
       
       System.out.print("Enter a String: ");
       str = keyboard.nextLine();
       
       System.out.print("Enter the char to be assessed: ");
       inputChar = keyboard.nextLine().trim();
       assessed = inputChar.charAt(0);
       
       keyboard.close();
       
       for(int i = 0; i < str.length(); i++)
       {
           if (str.charAt(i) == assessed)
           count++;

       }
       
       System.out.println("In the phrase: " + str + "\nThere are " + count + " " + assessed + "'s");
       
   }
}