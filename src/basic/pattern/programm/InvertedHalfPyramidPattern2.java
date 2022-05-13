/**
 * Q5. print inverted Half Pyramid pattern rotated by 180 degree
 * 
 *    output
 * 
 *   {
 *              *
 *             **
 *            ***
 *           ****  
 *          *****
 *             
 *       }
 *             
 *             
 */

package basic.pattern.programm;


public class InvertedHalfPyramidPattern2 {
	
	public static void main(String[] args) {
		
	               int size = 5 ;
	                
	                //outer loop for pyramid
	                for (int i=1; i <= size; i++) {
	                	
	                	//first inner loop for printing spaces before the star
	                	for (int space=1; space <= size-i; space++) {
	                		System.out.print(" ");
	                	}
	                	
	                	
	                	//second inner loop for printing stars after spaces
	                	for (int star=1; star <= i; star++) {
	                		System.out.print("*");;
	                	}
	                	
	                	//for next line
	                	System.out.println();
		
	                 }

	}
}
