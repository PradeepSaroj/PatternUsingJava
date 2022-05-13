 /**
  * Q1. print a Butterfly star pattern
 * 
 *  OUTPUT
 *  {
 *  
 *     *      *
 *     **    **
 *     ***  ***
 *     ********
 *     ********
 *     ***  ***
 *     **    **
 *     *      *
 *     
 *     }
 
 */

package advance.pattern.program;

public class ButterflyPattern {
	public static void main(String[] arg) {
		
		int size = 4;
		
		// first half of pattern Outer loop i goes 1 to 4
		for (int i=1; i <= size; i++) {
			
			//first inner loop print * in left side
			for (int star=1; star <=i; star++) {
				System.out.print("*");
			}
			
			//second inner loop for spaces
			for (int space=1; space<= (size-i)*2; space++ )
			{
				System.out.print(" ");
			}
			
			//third inner loop print * in right sight
			for (int star=1; star <=i; star++) {
				System.out.print("*");
			}
		
			//for next line
			System.out.println();
		}
		
		
		// second half of pattern Outer loop i goes 4 to 1
		for (int i=size; i >= 1; i--) {
			
			//first inner loop print * in left side
			for (int star=1; star <=i; star++) {
				System.out.print("*");
			}
			
			//second inner loop for spaces
			for (int space=1; space<= (size-i)*2; space++ )
			{
				System.out.print(" ");
			}
			
			//third inner loop print * in right sight
			for (int star=1; star <=i; star++) {
				System.out.print("*");
			}
		
			//for next line
			System.out.println();
		}
		
	}
}
