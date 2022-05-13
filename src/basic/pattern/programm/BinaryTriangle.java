 /**
  * Q9. print a 0-1 Triangle pattern
 * 
 *  OUTPUT
 *  {
 *  
 *    1
 *    01
 *    101
 *    0101
 *    10101
 *     
 *     }
 *
 */

package basic.pattern.programm;

public class BinaryTriangle {
	public static void main(String[] arg) {
		
		// Outer loop 
		for (int i=1; i <= 5; i++) {
			
			// Inner loop for print iteration
			for (int j=1; j <= i; j++) {
				
				int sumOfIndices = i+j;
				
				// Condition if sum Of Indices i,j is even then print 1 else print 0
				if (sumOfIndices % 2 == 0) {
					System.out.print("1");
				}
				else {
					System.out.print("0");
				}
			}
			
			System.out.println();
		}
		
	}
}
