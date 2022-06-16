package Function;

import java.util.Scanner;

public class operator {
	public static void main(String args[]) {
		aceept_no();
		
	}
      
	public static void aceept_no(){
	    int a,b;

	    Scanner sc=new Scanner(System.in);
	    System.out.println(" enter the two numbers: ");	  
	    a=sc.nextInt();
	    b=sc.nextInt();
	    System.out.println(" a is :"+a);
	    System.out.println(" b is :"+b);
	    athrmetic( a,b);
	    logical_opr(a,b);
	    relation(a,b);
	
	}
	
	public static void athrmetic( int a,int b){
		System.out.println( " The athrmrtic opr.: ");
		System.out.println( " The addition of two no is : "+(a+b));
		System.out.println( " The substraction of two no is : "+(a-b));
		System.out.println( " The multiplication of two no is : "+(a*b));
		System.out.println( " The division of two no is : "+(a/b));
		System.out.println( " The modulas  is : "+(a%b));
		
		}
	
	public static void logical_opr(int a,int b) {
		//AND
		System.out.println(" Te logical opr.");
		System.out.println(" The AND opr. is : "+ ( a>b&&a>b ) );
		System.out.println(" The AND opr. is : "+ ( a>b&&a<b ) );
		System.out.println(" The AND opr. is : "+ ( a<b&&a>b) );
		System.out.println(" The AND opr. is : "+ ( a<b&&a<b) );
		//OR 
		System.out.println(" The OR opr. is : "+ ( a>b||a>b ) );
		System.out.println(" The OR opr. is : "+ ( a>b||a<b ) );
		System.out.println(" The OR opr. is : "+ ( a<b||a>b) );
		System.out.println(" The OR opr. is : "+ ( a<b||a<b) );
		//OR 
		System.out.println(" The ! opr. is : "+ ( a>b|a>b ) );
		System.out.println(" The ! opr. is : "+ ( a>b|a<b ) );
		System.out.println(" The ! opr. is : "+ ( a<b|a>b) );
		System.out.println(" The ! opr. is : "+ ( a<b|a<b) );
	}
	public static void relation(int a,int b) {
		System.out.println( " The output is; ");
		if( a>b) {
			System.out.println( " a is greater than b: "+a);
		}
		else {
			System.out.println( " b is greater than a: "+b);
		}
		


			
		}
	}
		
		

