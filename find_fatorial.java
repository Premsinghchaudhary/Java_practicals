package loops;

import java.util.Scanner;

public class find_fatorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,fact=1;
		System.out.println(" enter the number");
		
		Scanner sc= new Scanner(System.in);
		n=sc.nextInt();
		 while(n>0) 
		 {
		    fact=fact*n;
		    n--;
	     }
          System.out.println( " factorial is = "+fact);
	}
         
}
