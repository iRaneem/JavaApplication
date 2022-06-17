
package imageviewer;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import javax.swing.JFrame;
import javax.swing.*;

public class ImageViewer  extends JFrame{
     private final int WINDOW_WIDTH = 380;  // Window width
     private final int WINDOW_HEIGHT = 320; // Window height
     private JPanel panel;        // A panel to hold a label
     private JPanel panel2;        // A panel to hold a button
     private JLabel label ;
     private JButton button;
     
 public  ImageViewer (){
      // Set the title.
      setTitle("Image Viewer ");
   
      // Set the size of the window.
      setSize(WINDOW_WIDTH, WINDOW_HEIGHT);

      // Specify what happens when the close button is clicked.
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
      // Create a BorderLayout manager for the content pane.
      setLayout(new BorderLayout());
      bulidpanel();
      bulidpanel2();
      
      add(panel,BorderLayout.NORTH);
      add(panel2,BorderLayout.SOUTH);
      // Display the window.
      setVisible(true);
   }
   void bulidpanel (){
       panel = new JPanel();
       label = new JLabel(" click the button to choose an image and display  ");
       panel.add(label);
   }
    void  bulidpanel2(){
        panel2 = new JPanel();
       button = new JButton("Get image");
       button.addActionListener(new ButtonListener());
       panel2.add(button);
       
   }
   private class ButtonListener implements ActionListener
   {
      public void actionPerformed(ActionEvent e){
          JFileChooser fileChooser = new JFileChooser();
          int status = fileChooser.showOpenDialog(null);
          if (status == JFileChooser.APPROVE_OPTION){
              File file = fileChooser.getSelectedFile();
              label.setIcon(new ImageIcon(file.getPath()));
              label.setText(null);
          }
     }
   }
       
    public static void main(String[] args) {
       new ImageViewer();
    }
    
}
