           //WAP to accept two no from user and do the process of swapping by using  
           //thired variable and also with without using third variable.
package Function;

import java.util.Scanner;

public class fun_demo {

	public static void main(String[] args) {
		accept_no();
	

	}
	  public static void accept_no() {
		  int a,b;
		  Scanner sc =new Scanner(System.in);
		  System.out.println(" Enter the two number :");
		  a=sc.nextInt();
		  b=sc.nextInt();
		  System.out.println(" the value of a is :"+a);
		  System.out.println(" the value of b is :"+b);
		  swapping(a,b);
		
		

	  }
	  public static void swapping(int x,int y){
		  x=x+y;
		  y=x-y;
		  x=x-y;
		  
		  System.out.println(" The swapping of b=x  :" + x);
		  System.out.println(" The swapping of a=y  :" +y);
		  
	  }

}
