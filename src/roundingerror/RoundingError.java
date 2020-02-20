/*
 * Mouner Dabjan 
 * 20/02/2020
 * The purpose of this program is to compare the square of the square root of any number
 */

package roundingerror;
import javax.swing.*; 
/**
 *
 * @author modab5310
 */
public class RoundingError {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        String input;
        double Usernumber;
        double error;
        double RoundOffError;
        
        
        input = JOptionPane.showInputDialog("Enter your number"); 
        Usernumber = Double.parseDouble(input); 
        Usernumber = Math.sqrt(Usernumber); 
        Usernumber = Math.pow(Usernumber,2); 
        error = Double.parseDouble(input);
       
       RoundOffError = Usernumber - error; 
      
        
        System.out.println("The square of the square root of the number input is " + Usernumber );
        System.out.println("The Round of error is " + RoundOffError);
        
        
        
       
       
        
        
        
         
        
        
    }
    
}
