import java.util.Scanner;
/**
 * Takes an input of a String of words, and checks whether those words are the same reversed when you take the first letter and move it to the end
 *
 * @author Enzo Kublinski-Kopp
 * @version v1.0
 * @since 09/27/2026
 */
public class ReverseWordProblems
{
   public static void main(String[] args){
       Scanner keyboard = new Scanner(System.in);
        String yesOrOther, word, tempWord, reversed;
        boolean keepGoing = true;

        do {
            System.out.print("Enter words separated by a space ending with the word quit: ");
            
            while (keyboard.hasNext()) {
                word = keyboard.next();

                if (word.equalsIgnoreCase("quit")) {
                    break;
                }
                 
                reversed = "";
                tempWord = word.substring(1) + word.substring(0,1);
                for (int i = tempWord.length()-1; i >= 0; i--)
                {
                    reversed += tempWord.substring(i,i+1);
                }
                
                if (word.equals(reversed))
                System.out.println(word + " works");
                else
                System.out.println(word + " does not work");
            }
           
            
            System.out.print("Enter yes to process another line? ");
            yesOrOther = keyboard.next();
                   
            if (yesOrOther.equalsIgnoreCase("yes"))
            {
                keepGoing = true;
            }
            else
            {
                keepGoing = false;
            }
               
           
            
        } while (keepGoing);
   }
}
