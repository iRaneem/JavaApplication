
package tictactoe;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.*;
public class Tictactoe extends JFrame{
 private final int WINDOW_WIDTH = 480;  // Window width
   private final int WINDOW_HEIGHT = 420; // Window height
   private JPanel gamePanel;        // A panel to hold a label
   private JPanel buttonPanel;        // A panel to hold a button
   private JLabel Label[][];        // A label to hold an image        
   private JButton newgame;
   private JButton exit;
    public Tictactoe(){
         // Set the title.
      setTitle("Tic Tac Toe");
   
      // Set the size of the window.
      setSize(WINDOW_WIDTH, WINDOW_HEIGHT);

      // Specify what happens when the close button is clicked.
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
      // Create a BorderLayout manager for the content pane.
      setLayout(new BorderLayout());
      // Build the panels.
      buildgamePanel();
      buildButtonPanel();
      add(gamePanel,BorderLayout.NORTH);
      add(buttonPanel,BorderLayout.SOUTH);
      
      // Display the window.
      setVisible(true);
    } private void buildgamePanel(){
        gamePanel = new JPanel();
        Label= new JLabel[3][3];
        for (int i =0 ; i<3;i++){
            for (int j=0;j<3;j++){
        Label[i][j]=new JLabel(" ");
        Label[i][j].setFont(new Font("verdana",Font.PLAIN,90));
            }}
        gamePanel.setLayout(new GridLayout(3,3));
    }
       private void buildButtonPanel(){
           buttonPanel = new JPanel();
           newgame = new JButton ("new game");
           newgame.addActionListener(new gameListener());
           exit = new JButton ("exit");
           exit.addActionListener(new exitListener());
           buttonPanel.add(newgame);
           buttonPanel.add(exit);
       }
    private class gameListener implements ActionListener
   {
      public void actionPerformed(ActionEvent e){
           //generate the x and o's to the boerd
          for(int i =0; i<3;i++){
            for (int j = 0; j<3;j++){
               Random rand = new Random();
               if (rand.nextInt((1-0)+1+0) == 1){
               Label[i][j].setText("X");
               gamePanel.add(Label[i][j]);
               }
               else{
                  Label[i][j].setText("O");
                  gamePanel .add(Label[i][j]);
               }
            }
          }
        //determining the winner
          if( hasWinner() == 0){
              JOptionPane.showMessageDialog(null," تعادل");
          }
          else if(hasWinner()==1){
              JOptionPane.showMessageDialog(null," x فوز");
          }
          else if(hasWinner()==-1){
              JOptionPane.showMessageDialog(null," o فوز");
          }
      }
    }      
/**
 * Determines if there is a winner in tic-tac-toe board.
 * @return 0 for draw,  1 for 'X',  -1 for 'O'
 */
public int hasWinner() {
   // FOR X'S WINS
    //checkDiagonals
    if ((Label[0][0].getText() == "X" && Label[1][1].getText() == "X" && Label[2][2].getText() == "X") ||
            (Label[0][2].getText() == "X" && Label[1][1].getText() == "X" && Label[2][0].getText() == "X")) {
            return 1;
    }   
    // checkVerticals
    for (int i = 0; i <= 2; i++) {
            if (Label[0][i].getText() == "X" && Label[1][i].getText() == "X" && Label[2][i].getText() == "X") {
                return 1;
            }
    }
    //checkHorizontals 
    for (int i = 0; i <= 2; i++) {
            if (Label[i][0].getText() == "X" && Label[i][1].getText() == "X" && Label[i][2].getText() == "X") {
                return 1;
            }
    }
    // FOR O'S WINS
    //checkDiagonals
    if ((Label[0][0].getText() == "O" && Label[1][1].getText() == "O" && Label[2][2].getText() == "O") ||
            (Label[0][2].getText() == "O" && Label[1][1].getText() == "O" && Label[2][0].getText() == "O")) {
            return -1;
    }   
    // checkVerticals
    for (int i = 0; i <= 2; i++) {
            if (Label[0][i].getText() == "O" && Label[1][i].getText() == "O" && Label[2][i].getText() == "O") {
                return -1;
            }
    }
    //checkHorizontals 
    for (int i = 0; i <= 2; i++) {
            if (Label[i][0].getText() == "O" && Label[i][1].getText() == "O" && Label[i][2].getText() == "O") {
                return 1;
            }
    }
 return 0;   
}
private class exitListener implements ActionListener{
      public void actionPerformed(ActionEvent e){
          System.exit(0);
      }
}

    public static void main(String[] args) {
       new Tictactoe();
    }
}
