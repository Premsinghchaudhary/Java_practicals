import java.util.Scanner;

   class Student
  {  
   public static void main (String  args[]) 
  {
   int roll,eng,hin,maths,eco,sci,per,marks; //variable and data type declared
   String name ;                       // data type is string use for name 

    Scanner sc=new Scanner(System.in);  //create scanner object 

   System.out.println("write your Student name  ");
   name =sc.nextLine();              
  System.out.println(" Student name is = " + name ); //for print the  student name 


   System.out.println("write the  roll of Student " );
   roll =sc.nextInt();
  System.out.println(" Student roll no.  = " + roll );  // for print the student roll no 
 



   System.out.println("write the your marks in english " );
   eng =sc.nextInt();
  System.out.println(" english  = " + eng );   // for print the marks in english 
    
   

   System.out.println("write the your marks in hindi " );
   hin =sc.nextInt();
  System.out.println(" hindi  = " + hin );// for print the marks in hindi


   System.out.println("write the your marks in maths " );
   maths =sc.nextInt();
  System.out.println(" maths  = " + maths );// for print the marks in maths


   System.out.println("write the your marks in economics" );
   eco =sc.nextInt();
  System.out.println(" economics  = " + eco );// for print the marks in economics


   System.out.println("write the your marks in science " );
   sci =sc.nextInt();
  System.out.println(" science = " + sci );// for print the marks in science 


    marks=eng+hin+maths+eco+sci;   //calculate sum of the  marks
    System.out.println(" The total sum of = "+marks);     // print sum of marks
   per = marks/5;   // calculate percentage of marks 
  System.out.println("  your percent is =   " +per+ "%" ); //print % of marks


  }
  }
