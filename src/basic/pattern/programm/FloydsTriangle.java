 /**
  * Q8. print a Floyd's Triangle pattern
 * 
 *  OUTPUT
 *  {
 *  
 *    1
 *    2 3
 *    4 5 6
 *    7 8 9 10
 *    11 12 13 14 15
 *     
 *     }
 
 */
 
package basic.pattern.programm;

public class FloydsTriangle {
	
	public static void main(String[] args) {
		
		int size = 5;
		int number = 1;
		// outer loop for increment pyramid
		for (int i=1; i <=size; i++) {
			
			//inner loop for increasing iteration 
			for (int j=1; j <= i; j++) {
				
				System.out.print(number+" ");
				++number;
			}
			
			
			System.out.println();
		}
		
	}
}
