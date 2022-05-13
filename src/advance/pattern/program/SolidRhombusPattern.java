 /**
  * Q2. print a Solid Rhombus star pattern
 * 
 *  OUTPUT
 *  {
 *           *****
 *          *****
 *         *****
 *        *****
 *       *****
 *     
 *     }
 */

package advance.pattern.program;

public class SolidRhombusPattern {
	public static void main(String[] ar) {
		
		int size = 5;
		
		//Outer loop for increment a pattern i is goes 1 to size
		for (int i=1; i <= 5; i++) {
			
			//first inner loop print spaces and space = size-i
			for (int space=1; space <= (size-i); space++) {
				System.out.print(" ");
			}
			
			//second inner loop print star * 1 to size
			for (int star=1; star <= size; star++) {
				System.out.print("*");
			}
			
			//for next line in outer loop
			System.out.println();
		}
			
	}
}
