/**
  * Q3. print a Palindromic Number pattern
 * 
 *  OUTPUT
 *  {
 *  
 *         1
 *        212
 *       32123
 *      4321234
 *     543212345
 *     
 *     }
 *
 */

package advance.pattern.program;

public class PalindromicNumberPattern {
	public static void main(String[] args) {
		
		int size = 9;
		
		// outer loop for incremental patter and i goes 1 to size of pattern
		for (int i=1; i <= size; i++) {
			
			// 1st inner loop for spaces start from 4 to 1 i.e space = size-i
			for (int space=1; space <= (size-i); space++) {
				System.out.print(" ");
			}
			
			
			int printNum=i; //printNum hold i value for iteration and printing i value
			
			// 2nd inner loop print i number in decremental manner in left side
			for (int leftNum=1; leftNum <= i; leftNum++) {
				 
				System.out.print(printNum);
				printNum--;
			}
			
		
			// right side number start from  i=2 to size of pattern in incremental manner
			  if (i>=2) {
				    //printRightNum hold i value for iteration and printing i value
				    int printRightNum = i;
				  
				    // loop start from 2 to size of pattern and print i 
				    for (int rightNum=1; rightNum <= i; rightNum++) {
					   System.out.print(printRightNum);
					      printRightNum--;
				     }
			    }
			
			
			System.out.println();
		}
		
	}
}
