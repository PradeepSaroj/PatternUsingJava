/**
  * Q7. print a Solid Rhombus star pattern
 * 
 *  OUTPUT
 *  {
 *           *****
 *          *   *
 *         *   *
 *        *   *
 *       *****
 *     
 *     }
 */


package advance.pattern.program;

public class HollowRhombusStarPattern {
	public static void main(String[] args) {
		
		int size = 5;
		// outer loop i goes 1 to size
		for (int i=1; i <= size; i++) {
			
			// 1st inner loop for printing space before star printing
			for (int space=1; space <= size-i; space++) {
				System.out.print(" ");
			}
			
			/*
			 *  2nd inner loop for printing star
			 *  and for hollow space we 
			 *  condition
			 *  if i==1 || i==5 || j==1 || j==5
			 *  then print star 
			 *  else print space 
			 */
			for (int star=1; star <= size; star++) {
				
				if (i==1 || i==5 || star==1 || star==5) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
		 
			System.out.println();
		}
		
	}
}
