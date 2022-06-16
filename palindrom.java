//WAP to accept a no from user and check it is palindrom or not .
package Function;

import java.util.Scanner;

public class palindrom {


	
	    public static void main(String[] args)
	    {
	        palidorm();
	    }

	    public static void palidorm()
	    {
	        Scanner sc = new Scanner(System.in);
	       
	       int n, r,sum=0,temp;    
	       
	       System.out.println("Please  enter the no : ");
	       n= sc.nextInt();
	  
	        temp=n;    
	        while(n>0)
	        {    
	            r = n%10;  
	            sum = (sum*10)+r;    
	            n = n/10;    
	        }

	        if(temp==sum)    
	        System.out.println("It is palindrom number :  "+sum);    
	        else    
	        System.out.println(" It is not a palindrom number : ");    
	        }  

	}

