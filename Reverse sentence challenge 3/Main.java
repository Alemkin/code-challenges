import java.util.*;
import java.io.*;

	public class Main {
		
		public static void main (String[] args) throws Exception {
		
		  File file = new File(args[0]);
		  BufferedReader in = new BufferedReader(new FileReader(file));
		  String line;
		  
	while ((line = in.readLine()) != null) {
        String[] lineArray = line.split("[\\s]+");
        if (lineArray.length > 0) {
			String output = "";
			for(int i = lineArray.length-1; i >= 0; i--)
{				output += lineArray[i];
				if (i != 0) { output += " "; }
}
			System.out.println(output);
        }
    }
	
	
  }		
		
		}
	
	
	
	
	
	
	