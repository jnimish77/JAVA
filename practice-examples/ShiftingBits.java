
package shiftingbits;
	import java.util.Scanner;

	public class ShiftingBits {

	    String s;
	    int value;
	    public ShiftingBits()
	    {
	      Scanner in = new Scanner(System.in);
	      System.out.println("Enter a number ");
	      s = in.nextLine();
	      value = Integer.parseInt(s);
	      // System.out.println("i: " + i);
	      System.out.println("Binary value is " + Integer.toBinaryString(value));

	    }
	        
	    public int rightShifts()
	    {
	        int a= value >> 3;
	        System.out.println("After right shifting 3 bits " + Integer.toBinaryString(a));
	        return 0;
	    }
	    
	     public int leftShifts()
	     
	    {
	        int b= value << 3;
	        System.out.println("After left shifting 3 bits " + Integer.toBinaryString(b));
	        return 0;
	    }
	    
	     public int negateALLBits()
	    {
	        System.out.println("After negating all bits " + Integer.toBinaryString(~value));
	        return 0;
	    }      
	    public static void main(String[] args)
	    {    
	       ShiftingBits SB = new ShiftingBits();
	       SB.rightShifts();
	       SB.leftShifts();
	       SB.negateALLBits();    
	    }   
	}


