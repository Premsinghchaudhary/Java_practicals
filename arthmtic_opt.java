import java.util.Scanner;
class arthmtic_opt
{
public static void main (String args[])//main method 
{
 Scanner sc= new Scanner(System.in);

  int num1,num2,res; //declartion of variable  and datatype

 System.out.println(" write the value of num1 = "); //get the no from user 
 num1=sc.nextInt(); //pass the value of num1 in scanner
 System.out.println( " The value of num1 is  = " +num1);//print the vakue of num1


 System.out.println(" write the value of num2 = ");//get the value from user
 num2=sc.nextInt();//pass the value of num2 in scanner
 System.out.println( " The value of num2 is  = " +num2);//print the value of num2

// using addition (+)

 res=(num1+num2);//calculate the value of num1 and num2
 System.out.println(" The  sum of two number is  : "+res );//print the addition of two no

//using multiplication (*)
 
res=(num1*num2); //calculte the value of num1 and num2
 System.out.println("The multipication of two numbers : "+res);//print the multiplication of two no

// using sub(-)

res =(num1-num2);//calculte the value of num1 and num2
System.out.println(" The substraction of two numbers is  : "+res);//print the substraction of two no

// using divide(/)

res =(num1/num2);//calculte the value of num1 and num2
System.out.println(" The Division is : "+res);//print the divison of two no



}
}
