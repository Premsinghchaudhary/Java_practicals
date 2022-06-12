import java.util.Scanner;
class arthmtic_opt
{
public static void main (String args[])
{
 Scanner sc= new Scanner(System.in);

  int num1,num2,res;

 System.out.println(" write the value of num1 = ");
 num1=sc.nextInt();
 System.out.println( " The value of num1 is  = " +num1);


 System.out.println(" write the value of num2 = ");
 num2=sc.nextInt();
 System.out.println( " The value of num2 is  = " +num2);

// using addition (+)

 res=(num1+num2);
 System.out.println(" The  sum of two number is  : "+res );

//using multiplication (*)
 
res=(num1*num2); 
 System.out.println("The multipication of two numbers : "+res);

// using sub(-)

res =(num1-num2);
System.out.println(" The substraction of two numbers is  : "+res);

// using divide(/)

res =(num1/num2);
System.out.println(" The Division is : "+res);



}
}