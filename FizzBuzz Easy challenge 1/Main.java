//Alexander Lemkin
//FizzBuzz www.codeeval.com
//5-15-14
import java.util.*;
import java.io.*;
public class Main {
    public static void main (String[] args) throws Exception {
    File file = new File(args[0]);
    BufferedReader in = new BufferedReader(new FileReader(file));
    String line;
    while ((line = in.readLine()) != null) {
        String[] lineArray = line.split("[\\s]+");

		final int[] ints = new int[lineArray.length];
		for (int i=0; i < lineArray.length; i++) {
        ints[i] = Integer.parseInt(lineArray[i]);
		}
		
        if (lineArray.length > 0) {
            int firstDiv = ints[0];
			int secDiv = ints[1];
			int count = ints[2];

	    for(int index = 1; index<=count; index++) {
		    if(index % firstDiv == 0 && index % secDiv == 0)
			    System.out.print("FB ");
		    else if (index % secDiv == 0)
			    System.out.print("B ");
		    else if (index % firstDiv == 0)
			    System.out.print("F ");
		    else
			    System.out.printf("%d ", index);
		}
	    System.out.print("\n");
        }
    }
  }
}
