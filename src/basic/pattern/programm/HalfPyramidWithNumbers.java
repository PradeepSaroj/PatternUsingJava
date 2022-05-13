/**
 * Q6. print Half Pyramid Pattern with number
 * 
 *  OUTPUT
 *  {
 *  
 *     1
 *     12
 *     123
 *     1234
 *     12345
 *     
 *     }
 *     
 */
package basic.pattern.programm;

public class HalfPyramidWithNumbers {
	
	public static void main(String[] ard) {
		
		int size = 5;
		
		//outer loop for size of pyramid
		for (int i=1; i<=size; i++) {
			
			//inner loop for printing a number pattern
			for (int j=1; j<=i; j++) {
				
				System.out.print(j);
			}
			
			//for next line
			System.out.println();
		}
	}

}
