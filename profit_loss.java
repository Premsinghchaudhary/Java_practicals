//Write a program to accept selling price and cost price for user and find out profit or loss.

 import java.util.Scanner;
 class profit_loss
{
public static void main (String args [])
{
   double SP,CP;

  
  Scanner sc = new Scanner(System.in);

 System.out.println("enter the selling price of : ");  //get the selling price from user
 SP=sc.nextDouble();
 System.out.println(" Selling price = ");


 System.out.println("enter the Cost price of : ");  //get the cost price from user
 CP=sc.nextDouble();
 System.out.println(" Cost price = ");


  
 

  if(SP>CP) // condition statment
 {
 System.out.println(" profit  = "+ (SP-CP) );
 }

 else
 {
 System.out.println(" loss = " + (CP-SP) );
 }



 

}
}