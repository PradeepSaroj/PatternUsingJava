/**
  * Q10. print a Invert half Pyramid Number pattern
 * 
 *  OUTPUT
 *  {
 *           1111
 *           222
 *           33
 *           4
 *           
 *     
 *     }
 */
package advance.pattern.program;

public class InverHalfPyramid {
	public static void main(String[] args) {
		
		int size = 4;
		
		for (int i=1; i <= size; i++) {
			
				for (int print=size; print >= i; print--) {
					
					System.out.print(i);
				}
				System.out.println();
			
		}
	}
}
