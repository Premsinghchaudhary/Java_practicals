import java.util.Scanner;
class logical_opt
{
public static void main (String args[])
{

  int x,y; //variable declared 
  System.out.println( "enter the two numbers  ");//get the no from user

  Scanner sc= new Scanner(System.in);//scanner
//pass the value of x and y in scanner
   x=sc.nextInt();
  y=sc.nextInt();
     


 

  //using && AND  LOGICAL 
     System.out.println(" AND  : "+ (x>y && x>y) );
  System.out.println(" AND  : "+ (x>y && x<y) );
   System.out.println(" AND  : "+ (x<y && x<y) );
       System.out.println(" AND  : "+ (x>y && x<y) );

 //using || OR  LOGICAL 
 
 System.out.println(" OR  : "+ (x>y || x<y) );
     System.out.println(" OR  : "+ (x>y || x>y) );
       System.out.println(" OR  : "+ (x>y || x<y) );
System.out.println(" OR  : "+ (x<y || x<y) );

//using  ! NOT LOGICAL
System.out.println(" NOT  : "+ (x<y | x<y) );
System.out.println(" NOT  : "+ (x>y | x<y) );
     System.out.println(" NOT  : "+ (x>y | x>y) );
       System.out.println(" NOT  : "+ (x>y | x<y) );

 
}
} 
