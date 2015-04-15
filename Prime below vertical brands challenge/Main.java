//Alexander Lemkin
//Prime numbers below given challenge
//5-17-14
import java.util.*;
import java.io.*;


	public class Main { 
		
		public static void main(String[] args) throws Exception {
		
		File file = new File(args[0]);
		BufferedReader in = new BufferedReader(new FileReader(file));
		String line;
		while ((line = in.readLine()) != null) {
			String[] lineArray = line.split("[\\s]+");
			if (lineArray.length > 0) {
				final int[] integer = new int[lineArray.length];
				integer[0] = Integer.parseInt(lineArray[0]);
		
				int sum = 0;
				int count = 0;
				int i = 2;
				boolean check = false;
				while (i < integer[0]) {
					check = false;
					for(int j=2;j<i;j++) {
					if(i%j==0) {
						check = true;
						break;
						}
				}
			if (check == false && i != 2){
				System.out.printf(",");
					}
			if (check == false) {
				System.out.print(i);
				
			}
			
			i++;
			}
				
		System.out.printf("\n");
		}
		}
		}
		
	}