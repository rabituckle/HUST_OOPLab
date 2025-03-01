package basics;
import javax.swing.*;

public class ChoosingOption {
    public static void main(String[] args) {
    	int option = JOptionPane.showOptionDialog(
    		    null,
    		    "Do you agree?",
    		    "Confirmation",
    		    JOptionPane.DEFAULT_OPTION,
    		    JOptionPane.QUESTION_MESSAGE,
    		    null,
    		    new String[]{"I do", "I don’t"},
    		);

        System.exit(0);
        
    }
}

