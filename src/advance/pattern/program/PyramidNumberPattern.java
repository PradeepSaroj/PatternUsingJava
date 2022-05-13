/**
  * Q9. print a Pyramid Number pattern
 * 
 *  OUTPUT
 *  {
 *             1
 *            1 2
 *           1 2 3
 *          1 2 3 4
 *         1 2 3 4 5  
 *           
 *     
 *     }
 */

package advance.pattern.program;

public class PyramidNumberPattern {
	
	public static void main(String[] args) {
		
		int size = 5;
		
		for (int i=1; i<=size;i++) {
			
			for (int space=1; space <= size-i; space++) {
				System.out.print(" ");
			}
			
			int number=1;
			for (int j=1; j<=i; j++) {
				System.out.print(number+" ");
				number++;
			}
			System.out.println();
		}
	}
}


