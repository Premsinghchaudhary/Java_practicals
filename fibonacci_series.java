//Write a Program to accept a no from user and display the fibonacci series .
package Function;



public class fibonacci_series {
      public static void main ( String args[]) {
    	  
    	  fib();
      }
      public static void fib(){
    	  int i,n=0,n1=1,n2,c=10;
    	  System.out.println("n = "+n);
    	  System.out.println("n1 = "+n1);
    	  
    	  for( i=2;i<c;i++) {
    		  n2=n+n1;
    		  System.out.println("n2 = "+n2);  
    		  n=n1;
    		  n1=n2;
    		  }
  	   
      }
      
}







