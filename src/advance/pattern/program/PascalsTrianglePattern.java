/**
  * Q8. print a Pascals Triangle pattern
 * 
 *  OUTPUT
 *  {
 *             1
 *            1 1
 *           1 2 1
 *          1 3 3 1
 *         1 4 6 4 1  
 *           
 *     
 *     }
 */

package advance.pattern.program;

public class PascalsTrianglePattern {
	public static void main(String[] args) {
		
		int size = 5;
		
		for (int i=1; i<=size;i++) {
			
			for (int space=1; space <= size-i; space++) {
				System.out.print(" ");
			}
			
			for (int j=1; j<=i; j++) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}
}
