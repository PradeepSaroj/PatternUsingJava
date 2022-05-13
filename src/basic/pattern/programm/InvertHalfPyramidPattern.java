/**
 * Q4. print Inverted half pyramid star pattern
 *  
 *  
 *   OUTPUT
 *   {
 *   
 *     *****
 *     ****
 *     ***
 *     *
 *     
 *     }
 */

package basic.pattern.programm;
 
import java.util.Scanner;

public class InvertHalfPyramidPattern {
	public static void main(String[] args) {
		
				Scanner input = new Scanner(System.in);
				
				System.out.println("Enter Size of Pyramid");
				
				int size = input.nextInt();
						
				input.close();
				
				// first loop  ( i >= 1 )
				for (int i=size; i >= 1; i--) {
					
					//second loop increment the pyramid
					for (int j=1; j <= i; j++){
						
						System.out.print("*");
					}
					
					System.out.println();
				}
				
				
	
		
	}
}
