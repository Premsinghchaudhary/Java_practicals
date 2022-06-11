//Write a program to accept a no from user if no is even than find out the cube.

 import java.util.Scanner; 
 class cube
 {
 public static void main(String args[])
 {
  int a;

 System.out.println("Enter the  numbers ");
   
 Scanner sc = new Scanner(System.in);
 
 a=sc.nextInt();

 if( a==0)
{
 System.out.println(" neither positive or nor negative = not defined ");

}
else if(a%2==0 )
{
 System.out.println("value of a is even now find a cube :" + (a*a*a) );
}
else()
{

 System.out.println(" value of a is odd");

}

 



}

 
}
}