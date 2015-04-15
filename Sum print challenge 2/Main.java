import java.util.*;


	public class Main { 
	
		public static void main(String[] args) throws Exception {
			int sum = 0;
			int count = 0;
			int i = 2;
			boolean check = false;
			while (count < 1000) {
			check = false;
				 for(int j=2;j<i;j++) {
					if(i%j==0) {
						check = true;
						
						}
				}
			if (check == false) {
				sum += i;
				count++;
			}
			i++;
			
			}
				
		System.out.println(sum);
		}
		
	}