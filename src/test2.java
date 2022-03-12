import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class test2 {

	public static void main(String[] args) throws IOException {
		
				// PrintWriter object for file3.txt
				PrintWriter pw = new PrintWriter("file3.txt");
				
				// BufferedReader object for file1.txt
				BufferedReader br1 = new BufferedReader(new FileReader("file1.txt"));
				BufferedReader br2 = new BufferedReader(new FileReader("file2.txt"));
				
				
				String line1 = br1.readLine();
				String line2 = br2.readLine();
				// loop to copy lines of
				// file1.txt and file2.txt
				// to file3.txt alternatively
				while (line1 != null || line2 !=null )
				{
					if(line1 != null)
					{
						pw.println(line1);
						line1 = br1.readLine();
					}
					
					if(line2 != null)
					{
						pw.println(line2);
						line2 = br2.readLine();
					}

					
					
				}
				
			
				pw.flush();
				
				
				
				
				 File file = new File("file3.txt");
				 
			        // Note:  Double backquote is to avoid compiler
			        // interpret words
			        // like \test as \t (ie. as a escape sequence)
			 
			        // Creating an object of BufferedReader class
			        BufferedReader br= new BufferedReader(new FileReader(file));

					
			 
			        // Declaring a string variable
			        String st;
			        // Condition holds true till+++++++++++++++++++
			        // there is character in a string
			        while ((st = br.readLine()) != null)
			 
			            // Print the string
			            System.out.println(st);
			        
			 
						long fileLength = file.length();
						String fileString = "Length of all characters : " + fileLength;
						System.out.println(fileString);
						
					
        
        
 
            // Open given file in append mode by creating an
            // object of BufferedWriter class
            BufferedWriter out = new BufferedWriter(
                new FileWriter(file, true));
 
            // Writing on output stream
            out.write(fileString);
            // Closing the connection
            out.close();
	             
                 // closing resources
				br1.close();
				br2.close();
				pw.close();
                   
                    
               
                   
                    
                    } 
               
	}
		