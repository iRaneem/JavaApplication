
package carddealer;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.ArrayList;
import java.util.Random;

/**
   This program demonstrates a task 1 to the
   Card Dealer programming challenge.
  
*/
//////////////////////////////////////////
public class CardDealer extends JFrame
{
   private final int WINDOW_WIDTH = 380;  // Window width
   private final int WINDOW_HEIGHT = 320; // Window height
   private JPanel deckPanel;        // A panel to hold a label
   private JPanel cardPanel;        // A panel to hold a label
   private JPanel buttonPanel;      // A panel to hold a button
   private JLabel deckLabel;        // A label to hold an image
   private JLabel cardLabel;        // A label to hold an image
   private ImageIcon deckImage;     // To hold a deck image
   private ImageIcon cardImage;     // To hold a card image
   private JButton button;          // A button to get a card from the deck
   private Container contentPane;   // To reference the content pane
   private Color selectedColor;
   private ArrayList<ImageIcon> cardImageList;  // To hold the card images.
   

   /**
      Constructor
   */
   
   public CardDealer()
   {
      // Set the title.
      setTitle("Card Dealer");
   
      // Set the size of the window.
      setSize(WINDOW_WIDTH, WINDOW_HEIGHT);

      // Specify what happens when the close button is clicked.
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
      // Create a BorderLayout manager for the content pane.
      setLayout(new BorderLayout());
       
      // Build the cardImageList
      buildCardImageList();

      // Build the panels.
      buildDeckPanel();
      buildButtonPanel();
      buildCardPanel();

      // Add the panels to the content pane.
      add(deckPanel, BorderLayout.WEST);
      add(cardPanel, BorderLayout.EAST);
      add(buttonPanel, BorderLayout.SOUTH);
      
      // Display the window.
      setVisible(true);
      //color chooser
      selectedColor = JColorChooser.showDialog(null, "Select a Background Color", Color.BLUE);
      deckPanel.setBackground(selectedColor);
      cardPanel.setBackground(selectedColor);
      buttonPanel.setBackground(selectedColor);
      
   }

   /**
      The buildDeckPanel method adds a label
      to a panel that displays an image of 
      a deck of cards.
   */

   private void buildDeckPanel()
   {
      // Create a panel.
      deckPanel = new JPanel();
      // Create an image icon to represent the deck of cards. you have to add the all path for the image , this card "Backface_Blue.jpg"
     //complete 
      deckImage = new ImageIcon("C:\\Users\\Re110\\OneDrive\\المستندات\\Backface_Blue.jpg"); 
      // Create a label using the image for the deck of cards. 
      //complete
      deckLabel = new JLabel(deckImage);
      // Add the label to the panel.
      deckPanel.add(deckLabel);
      
     
   }

   /**
      The buildCardPanel method adds an empty label
      to a panel initially, but this label will be
      used to display a card from the deck once the
      user clicks the button.
   */

   private void buildCardPanel()
   {
      // Create a panel.
      cardPanel = new JPanel();

      // Create a label.
      cardLabel = new JLabel();

      // Add the label to the panel.
      cardPanel.add(cardLabel);
     
      
   }
  
   /**
      The buildButtonPanel method adds a button
      to a panel.
   */

   private void buildButtonPanel()
   {
      // Create a panel.
      buttonPanel = new JPanel();
   
      // Create a button.
      button = new JButton("Deal a Card");
      
      // use Mnemonic to do (KeyEvent.VK_D)
     // complete 
     button.setMnemonic(KeyEvent.VK_D);
     
     // use ToolTip to present this message ( Click here to deal a card. ) on Button 
      // complete 
      button.setToolTipText("Click here to deal a card");
      
      // Register an action listener with the button.
      // complete 
      button.addActionListener(new ButtonListener());
      // Add the button to the panel. buttonPanel
      // complete 
      buttonPanel.add(button);
     
   }


   /**
      The buildCardImageList method fills the 
      ArrayList with images of a deck of 
      poker cards.
   */

   private void buildCardImageList()
   {
      // Create the cardImageList ArrayList 
      // to hold the ImageIcon objects.
      cardImageList = new ArrayList<>();
      
      // Add the ImageIcon objects to the cardImageList ArrayList
      // change all the image path to the one is apper in your file project 
      cardImageList.add(new ImageIcon("C:\\Users\\Re110\\OneDrive\\المستندات\\2_Clubs.jpg"));
      cardImageList.add(new ImageIcon("C:\\Users\\Re110\\OneDrive\\المستندات\\2_Diamonds.jpg"));
      cardImageList.add(new ImageIcon("C:\\Users\\Re110\\OneDrive\\المستندات\\2_Hearts.jpg"));
      cardImageList.add(new ImageIcon("C:\\Users\\Re110\\OneDrive\\المستندات\\2_Spades.jpg"));
      
      cardImageList.add(new ImageIcon("C:\\Users\\Re110\\OneDrive\\المستندات\\3_Clubs.jpg"));
      cardImageList.add(new ImageIcon("C:\\Users\\Re110\\OneDrive\\المستندات\\3_Diamonds.jpg"));
      cardImageList.add(new ImageIcon("C:\\Users\\Re110\\OneDrive\\المستندات\\3_Hearts.jpg"));
      cardImageList.add(new ImageIcon("C:\\Users\\Re110\\OneDrive\\المستندات\\3_Spades.jpg"));
      
      cardImageList.add(new ImageIcon("C:\\Users\\Re110\\OneDrive\\المستندات\\4_Clubs.jpg"));
      cardImageList.add(new ImageIcon("C:\\Users\\Re110\\OneDrive\\المستندات\\4_Diamonds.jpg"));
      cardImageList.add(new ImageIcon("C:\\Users\\Re110\\OneDrive\\المستندات\\4_Hearts.jpg"));
      cardImageList.add(new ImageIcon("C:\\Users\\Re110\\OneDrive\\المستندات\\4_Spades.jpg"));
      
      cardImageList.add(new ImageIcon("C:\\Users\\Re110\\OneDrive\\المستندات\\5_Clubs.jpg"));
      cardImageList.add(new ImageIcon("C:\\Users\\Re110\\OneDrive\\المستندات\\5_Diamonds.jpg"));
      cardImageList.add(new ImageIcon("C:\\Users\\Re110\\OneDrive\\المستندات\\5_Hearts.jpg"));
      cardImageList.add(new ImageIcon("C:\\Users\\Re110\\OneDrive\\المستندات\\5_Spades.jpg"));
      
      cardImageList.add(new ImageIcon("C:\\Users\\Re110\\OneDrive\\المستندات\\6_Clubs.jpg"));
      cardImageList.add(new ImageIcon("C:\\Users\\Re110\\OneDrive\\المستندات\\6_Diamonds.jpg"));
      cardImageList.add(new ImageIcon("C:\\Users\\Re110\\OneDrive\\المستندات\\6_Hearts.jpg"));
      cardImageList.add(new ImageIcon("C:\\Users\\Re110\\OneDrive\\المستندات\\6_Spades.jpg"));
      
      cardImageList.add(new ImageIcon("C:\\Users\\Re110\\OneDrive\\المستندات\\7_Clubs.jpg"));
      cardImageList.add(new ImageIcon("C:\\Users\\Re110\\OneDrive\\المستندات\\7_Diamonds.jpg"));
      cardImageList.add(new ImageIcon("C:\\Users\\Re110\\OneDrive\\المستندات\\7_Hearts.jpg"));
      cardImageList.add(new ImageIcon("C:\\Users\\Re110\\OneDrive\\المستندات\\7_Spades.jpg"));
      
      cardImageList.add(new ImageIcon("C:\\Users\\Re110\\OneDrive\\المستندات\\8_Clubs.jpg"));
      cardImageList.add(new ImageIcon("C:\\Users\\Re110\\OneDrive\\المستندات\\8_Diamonds.jpg"));
      cardImageList.add(new ImageIcon("C:\\Users\\Re110\\OneDrive\\المستندات\\8_Hearts.jpg"));
      cardImageList.add(new ImageIcon("C:\\Users\\Re110\\OneDrive\\المستندات\\8_Spades.jpg"));
      
      cardImageList.add(new ImageIcon("C:\\Users\\Re110\\OneDrive\\المستندات\\9_Clubs.jpg"));
      cardImageList.add(new ImageIcon("C:\\Users\\Re110\\OneDrive\\المستندات\\9_Diamonds.jpg"));
      cardImageList.add(new ImageIcon("C:\\Users\\Re110\\OneDrive\\المستندات\\9_Hearts.jpg"));
      cardImageList.add(new ImageIcon("C:\\Users\\Re110\\OneDrive\\المستندات\\9_Spades.jpg"));
      
      cardImageList.add(new ImageIcon("C:\\Users\\Re110\\OneDrive\\المستندات\\10_Clubs.jpg"));
      cardImageList.add(new ImageIcon("C:\\Users\\Re110\\OneDrive\\المستندات\\10_Diamonds.jpg"));
      cardImageList.add(new ImageIcon("C:\\Users\\Re110\\OneDrive\\المستندات\\10_Hearts.jpg"));
      cardImageList.add(new ImageIcon("C:\\Users\\Re110\\OneDrive\\المستندات\\10_Spades.jpg"));
      
      cardImageList.add(new ImageIcon("C:\\Users\\Re110\\OneDrive\\المستندات\\Jack_Clubs.jpg"));
      cardImageList.add(new ImageIcon("C:\\Users\\Re110\\OneDrive\\المستندات\\Jack_Diamonds.jpg"));
      cardImageList.add(new ImageIcon("C:\\Users\\Re110\\OneDrive\\المستندات\\Jack_Hearts.jpg"));
      cardImageList.add(new ImageIcon("C:\\Users\\Re110\\OneDrive\\المستندات\\Jack_Spades.jpg"));
      
      cardImageList.add(new ImageIcon("C:\\Users\\Re110\\OneDrive\\المستندات\\Queen_Clubs.jpg"));
      cardImageList.add(new ImageIcon("C:\\Users\\Re110\\OneDrive\\المستندات\\Queen_Diamonds.jpg"));
      cardImageList.add(new ImageIcon("C:\\Users\\Re110\\OneDrive\\المستندات\\Queen_Hearts.jpg"));
      cardImageList.add(new ImageIcon("C:\\Users\\Re110\\OneDrive\\المستندات\\Queen_Spades.jpg"));
      
      cardImageList.add(new ImageIcon("C:\\Users\\Re110\\OneDrive\\المستندات\\King_Clubs.jpg"));
      cardImageList.add(new ImageIcon("C:\\Users\\Re110\\OneDrive\\المستندات\\King_Diamonds.jpg"));
      cardImageList.add(new ImageIcon("C:\\Users\\Re110\\OneDrive\\المستندات\\King_Hearts.jpg"));
      cardImageList.add(new ImageIcon("C:\\Users\\Re110\\OneDrive\\المستندات\\King_Spades.jpg"));
      
      cardImageList.add(new ImageIcon("C:\\Users\\Re110\\OneDrive\\المستندات\\Ace_Clubs.jpg"));
      cardImageList.add(new ImageIcon("C:\\Users\\Re110\\OneDrive\\المستندات\\Ace_Diamonds.jpg"));
      cardImageList.add(new ImageIcon("C:\\Users\\Re110\\OneDrive\\المستندات\\Ace_Hearts.jpg"));
      cardImageList.add(new ImageIcon("C:\\Users\\Re110\\OneDrive\\المستندات\\Ace_Spades.jpg"));
      
      cardImageList.add(new ImageIcon("C:\\Users\\Re110\\OneDrive\\المستندات\\Joker_Black.jpg"));
      cardImageList.add(new ImageIcon("C:\\Users\\Re110\\OneDrive\\المستندات\\Joker_Red.jpg"));
   }
  
   /**
      Private inner class that handles the event when
      the user clicks the button.
   */
   
   private class ButtonListener implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
         // Determine if there are still card 
         // images left in the array list.
         if(!cardImageList.isEmpty())
         {  
            // Create a reference to a Random object.
            Random rand = new Random();
   
            // Generate a random number between 0 and the 
            // number of card images left in the array list,
            // and store the value in the index variable.
            int index = rand.nextInt(cardImageList.size());
   
            // Get a card image from the array list using
            // the index value that was generated randomly.
            // complete
             cardImage = cardImageList.get(index);
            // Display the card image.
            //complete
            cardLabel.setIcon(cardImage);
            // Remove the card image from the array list.
            cardImageList.remove(index);
         }
         else
         {
            // Remove the card image representing the deck of cards.
            deckLabel.setIcon(null);
            
            // Display a message indicating that there are no more 
            // cards left in the deck.
            JOptionPane.showMessageDialog(null, "There are " + 
                        "no more cards are left in the deck.");
         }
      }
   }

   /**
      The main method creates an instance of the CardDealer
      class, causing it to display its window.
     * @param args
   */
     
   public static void main(String[] args)
   {
       new CardDealer();
   }
     
      
        
}
