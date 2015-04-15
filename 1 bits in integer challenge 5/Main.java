//Alexander Lemkin
//Number of Ones www.codeeval.com
//5-17-14
import java.util.*;
import java.io.*;
import java.lang.*;
public class Main {
    public static void main (String[] args) throws Exception {
    File file = new File(args[0]);
    BufferedReader in = new BufferedReader(new FileReader(file));
    String line;
    while ((line = in.readLine()) != null) {
		int sum = 0;
        String[] lineArray = line.split("[\\s]+");
		final int[] ints = new int[1];
        ints[0] = Integer.parseInt(lineArray[0]);	
		if (lineArray.length > 0) {
			String binary = Integer.toBinaryString(ints[0]);
			for (int i = 0; i< binary.length(); i++){
				if (binary.charAt(i) == '1') {
					sum++;
			}
			}
			
			
			
		}
		
		System.out.println(sum);
		
	}
	
		
		
		
		
		
	}
}