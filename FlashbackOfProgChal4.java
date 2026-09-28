import java.util.Scanner;
/**
 * Prints a diamond with an inputted number as a width, with the width always an odd number
 *
 * @author Enzo Kublinski-Kopp
 * @version v1.0
 * @since 09/27/2026
 */
public class FlashbackOfProgChal4
{
   public static void main(String[] args){
       int width, middleRow;
       
       Scanner keyboard = new Scanner(System.in);

       System.out.print("Enter max width for the diamond: ");
        width = keyboard.nextInt();

       if (width % 2 == 0) {
            width += 1;
       }

       middleRow = width / 2;
       
       for (int i = 0; i <= middleRow; i++) {
            for (int j = 0; j < middleRow - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < (2 * i + 1); k++) {
                System.out.print("*");
            }
            System.out.println();
       }
        
       for (int i = middleRow - 1; i >= 0; i--) {
            for (int j = 0; j < middleRow - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < (2 * i + 1); k++) {
                System.out.print("*");
            }
            System.out.println();
       }

       keyboard.close();
       
   }
}
