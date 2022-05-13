
/** Q1. Print Solid Rectangle * (Star) Pattern
 * 
 * OUTPUT
 * 
 *  {
 *    *****
 *    *****
 *    *****
 *    *****
 *    } 
 *
 */

package basic.pattern.programm;
public class SolidRectanglePattern {
	
        public static void main(String[] args) {
			
        	int row = 4;
        	int coloum = 5;
        	
        	// Outer loop for row
        	for (int i=1; i <= row ; i++) {
        		
        		//Inner loop for coloum
        		for (int j=1; j <= coloum; j++) {
        			
        			System.out.print("*");
        		}
        		
        		System.out.println();
        	}
		}
}
