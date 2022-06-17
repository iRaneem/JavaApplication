
package cellphonechooser;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import javax.swing.*;
public class CellPhoneChooser extends JFrame{
  private JPanel panel; // containir
  private JPanel panel2; // containir
  private JPanel panel3; // containir
  private JLabel packagecost; // Displays a message
  private JLabel phonecost; // Displays a message
  private JLabel Optioncost; // Displays a message
  private JTextField packagefield; // Displays a cost
  private JTextField phonefield; // Displays a cost
  private JTextField optionfield; // Displays a cost
  private final int WINDOW_WIDTH = 400; // Label's width
  private final int WINDOW_HEIGHT = 200; // Label's height

 // The following will reference menu components.
  private JMenuBar menuBar; // The menu bar
  private JMenu fileMenu; // The File menu
  private JMenu packageMenu; // The package menu
  private JMenu phoneMenu; // The  phone Menu
  private JMenu optioinMenu; // The  optioinMenu
  private JMenuItem exitItem; // To exit
  private JCheckBoxMenuItem min300; 
  private JCheckBoxMenuItem min800; 
  private JCheckBoxMenuItem min1500; 
  private JCheckBoxMenuItem model100; 
  private JCheckBoxMenuItem model110; 
  private JCheckBoxMenuItem model200; 
  private JCheckBoxMenuItem voicemail;
  private JCheckBoxMenuItem textmessage; 
  //constractor
 public CellPhoneChooser(){
     // Set the title.
      setTitle(" Cell Phone Chooser ");
      // Set the size of the window.
      setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
      // Specify what happens when the close button is clicked.
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setLayout(new BorderLayout());
      bulidpanel();
      add(panel,BorderLayout.NORTH);
      add(panel2,BorderLayout.CENTER);
      add(panel3,BorderLayout.SOUTH);
      bulidmenubar();
      pack();
      // Display the window.
      setVisible(true);
 }
private void bulidmenubar(){
    menuBar = new JMenuBar();
    bulidfilemenu();
    bulidpackageMenu();
    bulidphoneMenu();
    bulidoptioinMenu();
    menuBar.add (fileMenu);
    menuBar.add (packageMenu);
    menuBar.add (phoneMenu);
   menuBar.add (optioinMenu);
   setJMenuBar(menuBar);
}
private void bulidfilemenu() {
// Create an Exit menu item.
fileMenu = new JMenu("File");
exitItem = new JMenuItem("Exit");
exitItem.setMnemonic(KeyEvent.VK_X); 
exitItem.addActionListener(new ExitListener());
// Create a JMenu object for the File menu. fileMenu = new JMenu("File"); fileMenu.setMnemonic(KeyEvent.VK_F);
// Add the Exit menu item to the File menu.
fileMenu.add(exitItem); }
private class ExitListener implements ActionListener {
@Override
public void actionPerformed(ActionEvent e) {
System.exit(0); }
}
private void bulidpackageMenu(){
    packageMenu = new JMenu("Package");
    min300 = new JCheckBoxMenuItem("300 min");
    min300.addActionListener(new packageCost());
    min800 = new JCheckBoxMenuItem("800 min");
    min800.addActionListener(new packageCost());
    min1500 = new JCheckBoxMenuItem("1500 min");
    min1500.addActionListener(new packageCost());
    packageMenu.add(min300);
    packageMenu.add(min800);
    packageMenu.add(min1500);
}
private class packageCost implements ActionListener {
@Override
public void actionPerformed(ActionEvent e) {
    double cost=0;
    if (min300.isSelected()){
        cost+=45.00;
    }
    if (min800.isSelected()){
        cost+=65.00;
    }
    if (min1500.isSelected()){
        cost+=99.00;
    }
    packagefield.setText(Double.toString(cost));
 }
}
private void bulidphoneMenu(){
    phoneMenu = new JMenu("Phone");
    model100 = new JCheckBoxMenuItem("Model 100");
    model100.addActionListener(new phoneCost());
    model110 = new JCheckBoxMenuItem("Model 110");
    model110.addActionListener(new phoneCost());
    model200 = new JCheckBoxMenuItem("Model 200");
    model200.addActionListener(new phoneCost());
    phoneMenu.add(model100);
    phoneMenu.add(model110);
    phoneMenu.add(model200);
}
private class phoneCost implements ActionListener {
 @Override
 public void actionPerformed(ActionEvent e) {
    double cost=0;
    if (model100.isSelected()){
        cost+=29.95;
    }
    if (model110.isSelected()){
        cost+=49.95;
    }
    if (model200.isSelected()){
        cost+=99.95;
    }
    double tax= 0.06;
    cost=cost+(cost*tax);
    phonefield.setText(Double.toString(cost));
 }
}
private void bulidoptioinMenu(){
    optioinMenu = new JMenu("Optioin");
    voicemail = new JCheckBoxMenuItem("voice email");
    voicemail.addActionListener(new optioinCost());
    textmessage = new JCheckBoxMenuItem("text message");
    textmessage.addActionListener(new optioinCost());
    optioinMenu.add(voicemail);
    optioinMenu.add(textmessage);
}
private class optioinCost implements ActionListener {
 @Override
 public void actionPerformed(ActionEvent e) {
    double cost=0;
    if (voicemail.isSelected()){
        cost+=5.00;
    }
    if (textmessage.isSelected()){
        cost+=10.00;
    }
    optionfield.setText(Double.toString(cost));
 }
}
 private void bulidpanel(){
      panel = new JPanel();
      panel2 = new JPanel();
      panel3 = new JPanel();
      panel.setLayout(new FlowLayout(FlowLayout.CENTER));
      panel2.setLayout(new FlowLayout(FlowLayout.CENTER));
      panel3.setLayout(new FlowLayout(FlowLayout.CENTER));
      packagecost = new JLabel("package cost ");
      phonecost = new JLabel(" phone cost");
      Optioncost = new JLabel(" Option cost ");
      
      packagefield =new JTextField(15);
      phonefield =new JTextField(15);
      optionfield =new JTextField(15);
      
      packagefield.setEditable(false);
      phonefield.setEditable(false);
      optionfield.setEditable(false);
      
      panel.add(packagecost);
      panel2.add(phonecost);
      panel3.add(Optioncost);
      
      panel.add(packagefield);
      panel2.add(phonefield);
      panel3.add(optionfield);
 }
    public static void main(String[] args) {
       new CellPhoneChooser();
    }
    
}
