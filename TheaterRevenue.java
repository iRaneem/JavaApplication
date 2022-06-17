// Raneem Alomari 2006352 assignment 2
package theaterrevenue;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.*; // Needed for Swing classes
import java.awt.event.*; // Needed for ActionListener Interface
public class TheaterRevenue extends JFrame {
    private JPanel panel; // To reference a panel
     private JPanel ButtonPanel;// To reference a panel
     private JLabel messageLabel; // To reference a label 
     private JLabel messageLabel2; // To reference a label 
     private JLabel messageLabel3; // To reference a label 
     private JLabel messageLabel4; // To reference a label 
     private JTextField adult_ticket_price; // To reference a text field
     private JTextField adult_tickets_sold; // To reference a text field
     private JTextField child_ticket_price; // To reference a text field
     private JTextField child_tickets_sold; // To reference a text field
     private JButton calcButton; // To reference a button
      private JButton RestartButton;
     private final int WINDOW_WIDTH = 500; // Window width
     private final int WINDOW_HEIGHT = 200; // Window height
     /**
     Constructor
    */
     public TheaterRevenue(){
     // Set the window title.
     setTitle(" Theater Revenue ");
     // Set the size of the window.
     setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
     // Specify what happens when the close button is clicked.
     setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     // Build the panel and add it to the frame.
    buildPanel();
    buildButtonPanel();
    setLayout(new BorderLayout());
    panel.setLayout(new GridLayout(4,2));
    // Add the panel to the frame's content pane.
    add(panel,BorderLayout.NORTH);
    add(ButtonPanel,BorderLayout.SOUTH);
    // Display the window.
    setVisible(true);}
    /**
    The buildPanel method adds a label, a text field,
    and a button to a panel.
    */
    private void buildPanel() {
        
      // Create a label to display instructions.
     messageLabel = new JLabel(" Enter the adult ticket price :");
      // Create a text field 100 characters wide.
    adult_ticket_price = new JTextField(10);
    // Create a label to display instructions.
    messageLabel2 = new JLabel(" Number of adult tickets sold :" );
// Create a text field 100 characters wide.
     adult_tickets_sold = new JTextField(10);
      // Create a label to display instructions.
     messageLabel3 = new JLabel(" Enter the child ticket price :" );
// Create a text field 100 characters wide.
    child_ticket_price = new JTextField(10);
    // Create a label to display instructions.
     messageLabel4 = new JLabel(" Number of child tickets sold :" );
// Create a text field 100 characters wide.
    child_tickets_sold = new JTextField(10);
   

    // Create a JPanel object and let the panel
    // field reference it.
    panel = new JPanel();
    // Add the label, text field, and button
     // components to the panel.
     panel.add(messageLabel);
     panel.add(adult_ticket_price);
     panel.add(messageLabel2);
     panel.add(adult_tickets_sold);
     panel.add(messageLabel3);
     panel.add(child_ticket_price);
     panel.add(messageLabel4);
     panel.add(child_tickets_sold);
     
     
   }//END OF THE METHODE
    private void buildButtonPanel(){
     // Create a button with the caption "Calculate".
    calcButton = new JButton("Calculate");
    RestartButton=new JButton("Restart");
    // Add an action listener to the button.
    calcButton.addActionListener(new CalcButtonListener());
    RestartButton.addActionListener(new ResetButtonListener());
    ButtonPanel = new JPanel();
    ButtonPanel.add(calcButton);
    ButtonPanel.add(RestartButton);
    } 
    //Restart == empty the boxes to enter new values
     private class ResetButtonListener implements ActionListener{
      public void actionPerformed(ActionEvent e) {                                        
            adult_ticket_price.setText("");
            adult_tickets_sold.setText("");
            child_ticket_price.setText("");
            child_tickets_sold.setText("");

      }
     }
     /** CalcButtonListener is an action listener class for the Calculate button.*/
       private class CalcButtonListener implements ActionListener{
           public void actionPerformed(ActionEvent e){
           final double netRevenuepercent = 0.80;
           String adult_ticket_price_input;
           String adult_tickets_sold_input;
           String child_ticket_price_input;
           String child_tickets_sold_input;
           double netRevenue=0.0;
           double Revenue=0.0;
           //outputs
           double revenue_adult_tickets;
           double netrevenue_adult_tickets;
           double revenue_child_tickets;
           double netrevenue_child_tickets;
           // Get the text entered by the user 
           adult_ticket_price_input = adult_ticket_price.getText();
           adult_tickets_sold_input = adult_tickets_sold.getText();
           child_ticket_price_input = child_ticket_price.getText();
           child_tickets_sold_input = child_tickets_sold.getText();
           
           revenue_adult_tickets=Double.parseDouble(adult_ticket_price_input)*Double.parseDouble(adult_tickets_sold_input);
           netrevenue_adult_tickets=revenue_adult_tickets * netRevenuepercent;
           revenue_child_tickets=Double.parseDouble(child_ticket_price_input)*Double.parseDouble(child_tickets_sold_input);
           netrevenue_child_tickets=revenue_child_tickets * netRevenuepercent;
           Revenue=revenue_child_tickets+revenue_adult_tickets;
           netRevenue= netrevenue_child_tickets+netrevenue_adult_tickets;
           //displaig the results
           JOptionPane.showMessageDialog(null,
            "the revenue for adult tickets of this night is : &"+ revenue_adult_tickets+
            "\nthe net revenue for adult tickets of this night is : &"+ netrevenue_adult_tickets+
            "\nthe revenue for child tickets of this night is : &"+ revenue_child_tickets+
            "\nthe net revenue for child tickets of this night is : &"+ netrevenue_child_tickets+
            "\nthe total gross is : &"+Revenue+
            "\nthe total net Revenue is : &"+netRevenue);
           }
       } // End of CalcButtonListener class
       
    /** The main method creates an instance  
     * which displays its window on the screen. */
    public static void main(String[] args) {
       new TheaterRevenue();
       
    }
}
