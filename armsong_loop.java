package loops;

import java.util.Scanner;
public class armsong_loop {

	public static void main(String [] args)
	{
 		// TODO Auto-generated method stub
        int num,sum=0;
		Scanner sc = new Scanner( System.in );
 System.out.println(" Enter the number:");
 num=sc.nextInt();
 int res=num;
 int r;
 do 
    {
	 r=num%10;
	 sum=sum+( r*r*r);
	 num=num/10;
    }
 while(num>0);
 if( sum==res) 
 {
	 System.out.println(" Its is armsong ");
	 
 }
 else {
	 System.out.println(" Its is not armsong ");
 }
	
	
	}
}

