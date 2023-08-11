package construct;

import java.util.Scanner;

public class Main {
	

	
		public static void main(String[] args) {
	        
			int floorArray[];
			int floorSize;
			
			System.out.println("Enter the total no of floors in the building ");
			
			Scanner scanner = new Scanner(System.in);
			floorSize = scanner.nextInt();
			
			floorArray = new int[floorSize];
		
			
			for (int i=0;i<floorSize;i++) {
				System.out.println("Enter the floor size given on day "+ (i+1));
				floorArray[i]=scanner.nextInt();					
			}
		
			construction ls = new construction();
			ls.sortList(floorSize,floorArray);
			scanner.close();
			}
	}
	


