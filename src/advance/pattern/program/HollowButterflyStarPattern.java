 /**
  * Q6. print a Hollow Butterfly star pattern
 * 
 *  OUTPUT
 *  {
 *  
 *     *      *
 *     **    **
 *     * *  * *
 *     *  **  *
 *     *  **  *
 *     * *  * *
 *     **    **
 *     *      *
 *     
 *     }
 
 */

package advance.pattern.program;

public class HollowButterflyStarPattern {
	public int size = 5;
	
	public void upperHalf() {
		// fist Outer loop for upper half and i goes 1 to size
	     for (int i=1; i <= size; i++) {
	    	 
	    	 /*
	    	 * Left Side
	    	 * first inner loop for printing star and space on left side 
	    	 * and leftSide loop goes from 1 to size
	    	 * and for hollow space we use condition
	    	 *  if (i==j || j==1) 
	    	 *  THEN print * 
	    	 *  else print " " (space)
            */
	    	 for(int leftSide=1; leftSide <= i; leftSide++) {
	    		 
	    		 if(leftSide==1 || leftSide==i) {
	    			 System.out.print("*");
	    		 }
	    		 else {
	    			 System.out.print(" ");
	    		 }
	    	 }
	    	 
	    	 // Printing space after printing star on left side
	    	 for (int space=1; space <= (size*2)-(i+i); space++) {
	    		 System.out.print(" ");
	    	 }
	    		 
	    	/*
	    	 * Right Side 
	    	 * second inner loop for printing star and space on right side
	    	 * and right side loop goes from size to 1
	    	 * 	and for hollow space we use condition
	    	 *  if (i==j || j==5) 
	    	 *  THEN print * 
	    	 *  else print " " (space)    	
	    	 */
	    	 
	    	   for(int rightSide=1; rightSide <= i; rightSide++) {
		    		 
		    		 if(rightSide==1 || rightSide==i) {
		    			 System.out.print("*");
		    		 }
		    		 else {
		    			 System.out.print(" ");
		    		 }
	    		 
	    	     }
	    	 System.out.println();		
	     }
	     
	     return;
	     
	}
	
	public void lowerHalf() {
		 
		// 2nd Outer loop for lower half and i goes from size to 1
	     for (int i=size; i >= 1; i--) {
	    	 
	    	 /*
	    	 * Left Side
	    	 * first inner loop for printing star and space on left side 
	    	 * and leftSide loop goes from 1 to size
	    	 * and for hollow space we use condition
	    	 *  if (i==j || j==1) 
	    	 *  THEN print * 
	    	 *  else print " " (space)
            */
	    	 for(int leftSide=1; leftSide <= i; leftSide++) {
	    		 
	    		 if(leftSide==1 || leftSide==i) {
	    			 System.out.print("*");
	    		 }
	    		 else {
	    			 System.out.print(" ");
	    		 }
	    	 }
	    	 
	    	 // Printing space after printing star on left side
	    	 for (int space=1; space <= (size*2)-(i+i); space++) {
	    		 System.out.print(" ");
	    	 }
	    		 
	    	/*
	    	 * Right Side 
	    	 * second inner loop for printing star and space on right side
	    	 * and right side loop goes from size to 1
	    	 * 	and for hollow space we use condition
	    	 *  if (i==j || j==5) 
	    	 *  THEN print * 
	    	 *  else print " " (space)    	
	    	 */
	    	 
	    	   for(int rightSide=1; rightSide <= i; rightSide++) {
		    		 
		    		 if(rightSide==1 || rightSide==i) {
		    			 System.out.print("*");
		    		 }
		    		 else {
		    			 System.out.print(" ");
		    		 }
	    		 
	    	     }
	    	 System.out.println();
	    	}
	     
	     return;
	    
	}
	
	
	public static void main(String[] args) {
		
		HollowButterflyStarPattern classObj = new HollowButterflyStarPattern();
	   
		// first call upper half
		classObj.upperHalf();
		
		// second call lower half
		classObj.lowerHalf();
		
	     
	   
	}
}
