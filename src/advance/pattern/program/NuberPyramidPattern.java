 /**
  * Q3. print a Number Pyramid pattern
 * 
 *  OUTPUT
 *  {
 *  
 *         1
 *        2 2
 *       3 3 3
 *      4 4 4 4
 *     5 5 5 5 5  
 *     
 *     }
 
 */
package advance.pattern.program;

public class NuberPyramidPattern {
	public static void main(String[] args) {
		
		int size = 5;
		
		//Outer loop for pyramid increment pattern i goes 1 to size of pattern
		for (int i=1; i <= size; i++) {
			
			//first inner loop print spaces in space = size-i manner
			for (int space=1; space <= (size-i); space++) {
				System.out.print(" ");
			}
			
			//second inner loop print i number in this number goes 1 to i of pattern 
			for (int number=1; number <= i; number++) {
				System.out.print(i+" ");  // we concat space for gap between two number
			}
			
			//for next line in ever iteration of outer loop
			System.out.println();
		}
		
	}
}
