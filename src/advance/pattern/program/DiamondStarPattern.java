/**
  * Q5. print a Diamond Star pattern
 * 
 *  OUTPUT
 *  {
 *  
 *         *
 *        ***
 *       *****
 *      *******
 *      *******
 *       *****
 *        ***
 *         * 
 *     }
 *
 */

package advance.pattern.program;

public class DiamondStarPattern {
	public static void main(String[] args) {
		int size = 4;
		
		// 1st Outer loop for Upper half diamond pattern where i goes 1 to size i.e. condition i <= size
		for (int i=1; i <= size; i++) {
			
			// 1st inner loop for printing spaces before printing * and space goes 1 to space = size-i 
			for (int space=1; space <= (size-i); space++) {
				System.out.print(" ");
			}
			
			// 2nd inner loop for printing star * and star goes 1 to star = (i*2)-1
			for (int star=1; star <= (i*2)-1; star++) {
				System.out.print("*");
			}
			
			// for next line in 1st outer loop
			System.out.println();
			
		 } // 1st Upper Half completed
		
		// 2nd Outer loop for Lower half diamond pattern where i goes size to 1 i.e. condition i >= 1
				for (int i=size; i >= 1; i--) {
					
					// 1st inner loop for printing spaces before printing * and space goes 1 to space = size-i 
					for (int space=1; space <= (size-i); space++) {
						System.out.print(" ");
					}
					
					// 2nd inner loop for printing star * and star goes 1 to star = (i*2)-1
					for (int star=1; star <= (i*2)-1; star++) {
						System.out.print("*");
					}
					
					// for next line in 1st outer loop
					System.out.println();
					
				 } // 2nd Lower Half completed
				
	}
}
