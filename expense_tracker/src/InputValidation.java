import javax.swing.JFrame;
import javax.swing.JOptionPane;
/**
 * The InputValidation class checks if the amount and category entered by user are valid.
 */
public class InputValidation {

    //Checks if amount entered is valid
    public static void isAmountValid(String amount){
        try{
            //Check if amount is a number
            Double.parseDouble(amount);
            //Check if amount is between 0 and 1000
            if (Double.parseDouble(amount) > 1000 || Double.parseDouble(amount) < 0){
                JOptionPane.showMessageDialog(new JFrame(), "Enter a value between 0 and 1000", "Dialog",
                        JOptionPane.ERROR_MESSAGE);
                throw new IllegalArgumentException("Enter a value between 0 and 1000");
            }
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(new JFrame(), "Enter a valid number", "Dialog",
                    JOptionPane.ERROR_MESSAGE);
        }
    }
    //Checks if category entered is valid
    public static void isCategoryValid(String category){
        switch (category.toLowerCase()){
            case "food","travel","bills","entertainment","other":
                break;
            default:{
                JOptionPane.showMessageDialog(new JFrame(), "Enter a valid category (food, travel, bills, entertainment, other)", "Dialog",
                        JOptionPane.ERROR_MESSAGE);
                throw new IllegalArgumentException("Invalid category");
            }
        }
    }
}
