 //Write a programme to accept a character from user and check it is vowel or not using switch case.

import java.util.Scanner;

 class vowel_check
{
 public static void main(String args[])
{
 char c;
   Scanner sc = new Scanner(System.in);

 //Get the inputs form user

  System.out.println(" Enter the character : ");

    c =sc.next().charAt(0);

  // using condition statement 'if'
  if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U' )
{
 System.out.println(" It is vowel "+c);

}
else
{
 System.out.println(" It is constant "+c);
}  
   
   


  
}
}