/**
 * Q2. Print a Hollow star Rectangle Pattern
 * 
 *   OUTPUT
 *   {
 *      *****
 *      *   *
 *      *   *
 *      *****
 *     } 
 *      
 */


package basic.pattern.programm;

public class HollowRectanglePattern {
	
	public static void main(String[] args) {
		
		int row = 4;
		int coloum = 5;
		
		//Outer loop 
		for (int i=1; i <= row; i++) {
			
			//Inner loop
			for (int j=1; j <= coloum; j++) {
				
				/*
				 *  condition 
				 *  if row==1 or row==4 or coloum==1 or coloum==5
				 *  then print "*";
				 *  else space;
				 *  
				 */
				
				if (i==1 || j==1 || i==4 || j==5) {
					
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
				
			}
			
			System.out.println();
		}
	}

}
