// Write a program to accept length and breath from user and calculate area of rectangle and perimeter of rectangle

import java.util.Scanner;
class calculate_area
{
public static void main (String args [])
{
   double l,b,ar,pr;
 Scanner sc=new Scanner(System.in);

// get the  value of leghth and breath from user
 
 System.out.println("Enter the length:  ");
 l=sc.nextDouble(); 
 System.out.println("Enter the breath:  ");
 b=sc.nextDouble();
// print the value of length and breadth
 System.out.println("lenght =  "+l);
 System.out.println("breath =  "+b);

// calculate the area of rectangle
 ar= l*b;
 System.out.println("Area of rectangle is = "+ar );

//calculate the area of perimeter
 pr = 2*(l+b);
 System.out.println("Area of perimeter is = "+pr );



 
  
}
}  
