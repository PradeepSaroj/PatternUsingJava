/**
 * Q7. print Half Pyramid Pattern with number
 * 
 *  OUTPUT
 *  {
 *  
 *     12345
 *     1234
 *     123
 *     12
 *     1
 *     
 *     }
 *     
 */
package basic.pattern.programm;

public class InvertedHalfPyramidPatternWithNumber {
	
	public static void main(String[] ard) {
		
		int size = 5;
		
		//outer loop for size of pyramid in decriment order 
		for (int i=size; i >= 1; i--) {
			
			//inner loop for printing a number pattern
			for (int j=1; j<=i; j++) {
				
				System.out.print(j);
			}
			
			//for next line
			System.out.println();
		}
	}

}
