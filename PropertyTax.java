// Raneem Alomari 2006352 assignment 2
package propertytax;
import javax.swing.*; // Needed for Swing classes
import java.awt.event.*; // Needed for ActionListener Interface
public class PropertyTax extends JFrame {
     private JPanel panel; // To reference a panel
     private JLabel messageLabel; // To reference a label
     private JTextField propValueTextField; // To reference a text field
     private JButton calcButton; // To reference a button
     private final int WINDOW_WIDTH = 500; // Window width
     private final int WINDOW_HEIGHT = 100; // Window height
     /**
     Constructor
    */
     public PropertyTax()
     { // Set the window title.
     setTitle(" property TAX calculater ");
     // Set the size of the window.
     setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
     // Specify what happens when the close button is clicked.
     setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     // Build the panel and add it to the frame.
     buildPanel();
    // Add the panel to the frame's content pane.
    add(panel);
    // Display the window.
    setVisible(true);
    }
    /**
    The buildPanel method adds a label, a text field,
    and a button to a panel.
    */
     private void buildPanel() {
      // Create a label to display instructions.
     messageLabel = new JLabel("Enter your ACTUAL property value: " );
     // Create a text field 100 characters wide.
     propValueTextField = new JTextField(10);
     // Create a button with the caption "Calculate".
     calcButton = new JButton("Calculate property TAX");
     
     // Add an action listener to the button.
     calcButton.addActionListener(new CalcButtonListener());
     // Create a JPanel object and let the panel
     // field reference it.
     panel = new JPanel();
     // Add the label, text field, and button
     // components to the panel.
     panel.add(messageLabel);
     panel.add(propValueTextField);
     panel.add(calcButton);
     
   }//END OF METHOD
       /** CalcButtonListener is an action listener class for the Calculate button.*/
       private class CalcButtonListener implements ActionListener{
           public void actionPerformed(ActionEvent e){
           final double Assement_value = 0.60;
           final double TAX_value = 0.0064;
           double propertyTax=0.0;
           double Assementproperty=0.0;
           String user_proprety;
           // Get the text entered by the user 
           user_proprety = propValueTextField.getText();
           Assementproperty = Double.parseDouble(user_proprety) * Assement_value;
           propertyTax = Assementproperty * TAX_value;
           //displaig the results
           JOptionPane.showMessageDialog(null,"Assement value is : "+Assementproperty+"\nand the property tax is : "+ propertyTax );
        }
       }// End of CalcButtonListener class
    /** The main method creates an instance of  PropertyTax , which displays its window on the screen. */

    public static void main(String[] args){
         new PropertyTax();
    }
}
