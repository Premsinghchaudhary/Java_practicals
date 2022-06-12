//Write a program to accept radius from user and find out the area of circle and circumstances of circle


import java.util.*;

class circle
{
public static void main ( String args[])
{
  
  double r,aoc,coc,pie ;
 
 System.out.println( "Enter the radius  "); // get the radius from user

 Scanner sc=new Scanner(System.in);

 r=sc.nextDouble();                        //creat scanner object
 System.out.println("Radius r =   "+r) ;

 pie=3.14; // The value of pie
 
 
 aoc=(pie*r*r);
 System.out.println("The area of circle is = "+aoc);

 coc=2*(pie*r);
 System.out.println("The area of ciircumstance is = "+coc);

}
}