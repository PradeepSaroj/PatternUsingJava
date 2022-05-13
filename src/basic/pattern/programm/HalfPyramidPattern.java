/**
 * Q3. print Half Pyramid Star Pattern
 * 
 *  OUTPUT
 *  {
 *  
 *     *
 *     **
 *     ***
 *     ****
 *     *****
 *     
 *     }
 *     
 */
package basic.pattern.programm;

import java.util.Scanner;

public class HalfPyramidPattern {
	
	public static void main(String[] arg) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter Size of Pyramid");
		
		int size = input.nextInt();
				
		input.close();
		
		// first loop
		for (int i=1; i <= size; i++) {
			
			//second loop increment the pyramid
			for (int j=1; j <= i; j++){
				
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		
	}

}
