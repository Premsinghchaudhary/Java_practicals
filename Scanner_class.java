  import java.util.Scanner;
  class Scanner_class
{
  public static void main( String args []) //main method 
{
  int num1,num2,sum;                        //use datatype 

  Scanner sc =new Scanner(System.in);      //using a Scanner

  System.out.println( " write your first number");
  num1=sc.nextInt();                         //create scanner object
  System.out.println(" num1 = "+num1);


  System.out.println( " write your second number");
  num2=sc.nextInt();
  System.out.println(" num2 = "+num2);

  sum=num1+num2;
  System.out.println(" The sum of two number is = "+sum); 


      
}
}
