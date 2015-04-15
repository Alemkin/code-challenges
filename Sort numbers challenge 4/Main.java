import java.util.*;
import java.io.*;
import java.text.DecimalFormat;

public class Main {
    public static void main (String[] args) throws Exception {
    File file = new File(args[0]);
    BufferedReader in = new BufferedReader(new FileReader(file));
    String line;
	DecimalFormat df = new DecimalFormat("0.000");
	
    while ((line = in.readLine()) != null) {
        String[] lineArray = line.split("[\\s]+");

        if (lineArray.length > 0) { 
		final double[] doubles = new double[lineArray.length];
		for (int i=0; i < lineArray.length; i++) {
        doubles[i] = Double.parseDouble(lineArray[i]);
		}
		Arrays.sort(doubles);
		for (int j = 0; j < doubles.length; j++){
			if (j == doubles.length - 1) {
				System.out.printf(df.format(doubles[j]) + "\n");
				break;
			}
			System.out.printf(df.format(doubles[j]) + " ");
		}
		
		
		}

		
	}
	
}
}