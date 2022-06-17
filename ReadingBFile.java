
package readingbfile;
import java.io.*;
public class ReadingBFile {
 public static void main(String[] args) throws Exception {
 int number; // A number read from the file
 boolean endOfFile = false; // EOF flag
 // Create the binary file input objects.
 FileInputStream inputfile = new FileInputStream ("C:\\Users\\Re110\\OneDrive\\سطح المكتب\\WritingBFile");
 DataInputStream readfile = new DataInputStream( inputfile);
 System.out.println("Reading numbers from the file: ");
 // Read the contents of the file.
 while (!endOfFile) {
 try { 
     number = inputfile.read();
     System.out.print(number+"\n");
 } catch (EOFException e) {
 endOfFile = true;
 e.getMessage();}
 }
 System.out.println("\nDone.");
 // Close the file.
inputfile.close();
 
 }
}
