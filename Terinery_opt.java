import java.util.Scanner;

class Terinery_opt{
public static void main (String args[])
{
  //declartaion variable
  int n1,n2,res;       
  //taking inputs from user
  System.out.println("Enter the two number : ");
  
Scanner sc=new Scanner (System.in);

    n1=sc.nextInt();
        n2=sc.nextInt();
        System.out.println("The n1 =  " +n1);
        System.out.println("The n2 =  " +n2);
        
       res= ( n1 > n2) ? n1 : n2;
       System.out.println(" The result is = "+res);
            

}
}