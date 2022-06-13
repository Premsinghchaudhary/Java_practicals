package loops;
import java.util.Scanner;

public class multipication_table {

	public static void main (String args []) {
		int x;
	Scanner sc = new Scanner(System.in);
	
	System.out.print( " enter the number : ");
	x=sc.nextInt();
//using for loop
	
		for( int i=1;i<11;i++) {
			System.out.println( x + " * " +i+" = " +( x*i));
		}
	}
}
