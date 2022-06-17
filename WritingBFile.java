
package writingbfile;
import java.io.*;
public class WritingBFile {
    public static void main(String[] args) throws IOException {
 // An array to write to the file
 int[] numbers = {3, 5, 7, 9, 11, 13, 15};
 // Create the binary output objects.
 FileOutputStream outputfile= new FileOutputStream("num.dat",true);
 DataOutputStream write =new DataOutputStream(outputfile);
 System.out.println("Writing the numbers to the file...");
 try{ 
 // Write the array elements to the file.
 for (int i = 0; i < numbers.length; i++) {
 outputfile.write(numbers[i]);
 System.out.println("writing: "+numbers[i]); }
 }catch(Exception e){
  e.getMessage();
}
System.out.println("Done.");
// Close the file.
outputfile.close();
 } 
}

