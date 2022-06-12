import java.util.Scanner;
class bitwise
{
    public static void main (String args [])
    {
        int n1,n2,res;             //decleration of variable
        Scanner sc=new Scanner(System.in);
      
      System.out.println(" enter the two numbers : ");
       n1=sc.nextInt();
       n2=sc.nextInt();

       //print the value of n1 and n2
       System.out.println(" n1 = "+n1);
       System.out.println(" n2 = "+n2);

       //bitwise opt

       res=n1&n2;  
       System.out.println(" The bitwise END is "+res);

       res=n1|n2;  
       System.out.println(" The bitwise OR is "+res);

       res=n1^n2;  
       System.out.println(" The bitwise XOR is "+res);

       
    }
}