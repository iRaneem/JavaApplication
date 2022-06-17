// Raneem Alomari 2006352 assignment 2
package longdistancecalls;
import javax.swing.*; // Needed for Swing classes
import java.awt.event.*; // Needed for ActionListener Interface
 import java.awt.*;
public class LongDistanceCalls extends JFrame{
     private JPanel textandbuttonpanel; // To reference a panel
     private JPanel radibuttonpanel; 
     private JLabel messageLabel1;// To reference a label
     private JRadioButton Daytime;
     private JRadioButton evening;
     private JRadioButton offPeak;
     private JTextField callsMin;
     private JButton calcButton; // To reference a button
     private JButton exitButton; // To reference a button
     private final int WINDOW_WIDTH = 300; // Window width
     private final int WINDOW_HEIGHT = 300; // Window height
     /**
     Constructor
    */
    public LongDistanceCalls(){     
     // Set the window title.
     setTitle("Long Distance Calls");
     // Set the size of the window.
     setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
     // Specify what happens when the close button is clicked.
     setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     // Build the panel and add it to the frame.
     // Create a BorderLayout manager.
      setLayout(new BorderLayout());
      buildradibuttonPanel();
      buildtextandbuttonpanel();
      // Add the panel to the frame's content pane.
      radibuttonpanel.setLayout(new GridLayout(4,1));
     add(radibuttonpanel,BorderLayout.NORTH);
     // Add the panel to the frame's content pane
     add(textandbuttonpanel,BorderLayout.CENTER);
     // Display the window.
     setVisible(true);
    }
    
    
    /**
    The buildPanel method adds a label, a text field,
    and a button to a panel.
     */
    private void buildradibuttonPanel() {
        // Create the label, text field,
        Daytime=new JRadioButton("Daytime (6:00 a.m. through 5:59 p.m.)");
        evening= new JRadioButton("Evening (6:00 p.m. through 11:59 p.m.)");
        offPeak= new JRadioButton("Off-Peak (12:00 a.m. through 5:59 a.m.)"); 
        // Create a JPanel object
        radibuttonpanel = new JPanel();
        // Add a border around the panel.
        radibuttonpanel.setBorder(BorderFactory.createTitledBorder("select a rate category"));
        radibuttonpanel.add(Daytime);
        radibuttonpanel.add(evening);
        radibuttonpanel.add(offPeak);
         
    } // End of the methode buildPanel.
    private void buildtextandbuttonpanel(){
        messageLabel1 = new JLabel(" Enter  : ");
        callsMin = new JTextField("  the call minutes  ");
        calcButton = new JButton (" calculate charge");
        exitButton = new JButton (" Exit");
        // Add action listeners to the radio buttons.
        calcButton.addActionListener(new CalcButtonListener());
        exitButton.addActionListener(new exitButtonListener());
        // Create a JPanel object
        textandbuttonpanel = new JPanel();
        //Add the text field
        textandbuttonpanel.setBorder(BorderFactory.createTitledBorder("contact time"));
  
        textandbuttonpanel.add(messageLabel1);
        textandbuttonpanel.add(callsMin);
        textandbuttonpanel.add(calcButton);
        textandbuttonpanel.add(exitButton);
    }// End of the methode buildtextandbuttonpanel.
    private class exitButtonListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            System.exit(0);
        }
    }
      private class CalcButtonListener implements ActionListener{
          public void actionPerformed(ActionEvent e){
             String input = callsMin.getText();
             double callcharge=0.0; //to avoid any null values
             // Determine which radio button was clicked.
             if (Daytime.isSelected()&& evening.isSelected()&& offPeak.isSelected()){
                 
                 //displaig the results
             JOptionPane.showMessageDialog(null,
                     "the charge of your Daytime call is : "+Double.parseDouble(input)*0.07+" $"+
                     "\n the charge of your evening call is : "+ Double.parseDouble(input)*0.12+" $"+
                     "\n the charge of your offPeak call is : "+Double.parseDouble(input)*0.05+" $");
             }
             else if(Daytime.isSelected()&&evening.isSelected()){
             JOptionPane.showMessageDialog(null,
                     "the charge of your Daytime call is : "+Double.parseDouble(input)*0.07+" $"+
                     "\n the charge of your evening call is : "+ Double.parseDouble(input)*0.12+" $");}
             else if(Daytime.isSelected()&& offPeak.isSelected()){
                 JOptionPane.showMessageDialog(null,
                 "the charge of your Daytime call is : "+Double.parseDouble(input)*0.07+" $"+
                 "\n the charge of your offPeak call is : "+Double.parseDouble(input)*0.05+" $");
             }
             else if(evening.isSelected()&& offPeak.isSelected()){
                 //displaig the results
             JOptionPane.showMessageDialog(null,
                 "\n the charge of your evening call is : "+ Double.parseDouble(input)*0.12+" $"+
                 "\n the charge of your offPeak call is : "+Double.parseDouble(input)*0.05+" $");
             }
             else if(Daytime.isSelected()){
             callcharge = Double.parseDouble(input)*0.07;
             //displaig the results
             JOptionPane.showMessageDialog(null," the charge of your call is : "+callcharge+" $");
             }
             else if (evening.isSelected()){
             callcharge = Double.parseDouble(input)*0.12;
             //displaig the results
             JOptionPane.showMessageDialog(null," the charge of your call is : "+callcharge+" $");
             }
             else{
             callcharge = Double.parseDouble(input)*0.05;
             //displaig the results
             JOptionPane.showMessageDialog(null," the charge of your call is : "+callcharge+" $");
             }
             
            
          }
       }//the End of the class
      
    /** The main method creates an instance of  PropertyTax 
     * which displays its window on the screen. */  
    public static void main(String[] args) {
        new LongDistanceCalls();
    }

}
