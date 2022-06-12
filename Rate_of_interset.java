//Write a program to accept principal amount,  rate of interest,  no of years from user and calculat simple interest.



import java.util.Scanner;

class Rate_of_interset
{
public static void main ( String args[])
{
  double  PA , R , Y , SI ;

 Scanner sc =new Scanner(System.in);   //using scanner

 System.out.print(" ENTER the Principal amount : "); //get the principal amount from user
 PA=sc.nextDouble();
 
 System.out.print( " ENTER  the no of years  : "); //get the no of years  from user
 Y=sc.nextDouble();
 
 System.out.print( " ENTER  the rate of interest   : "); //get the no of years  from user
 R=sc.nextDouble();

 SI=(PA*R*Y)/100;
 System.out.println("Simple interest is : "+SI);
 


 

}
}