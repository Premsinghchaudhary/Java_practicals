import java.util.Scanner;

   class Student
  {  
   public static void main (String  args[]) 
  {
   int roll,eng,hin,maths,eco,sci,per,marks;
   String name ;

    Scanner sc=new Scanner(System.in);

   System.out.println("write your Student name  ");
   name =sc.nextLine();
  System.out.println(" Student name is = " + name );


   System.out.println("write the  roll of Student " );
   roll =sc.nextInt();
  System.out.println(" Student roll no.  = " + roll );
 



   System.out.println("write the your marks in english " );
   eng =sc.nextInt();
  System.out.println(" english  = " + eng );
    
   

   System.out.println("write the your marks in hindi " );
   hin =sc.nextInt();
  System.out.println(" hindi  = " + hin );


   System.out.println("write the your marks in maths " );
   maths =sc.nextInt();
  System.out.println(" maths  = " + maths );


   System.out.println("write the your marks in economics" );
   eco =sc.nextInt();
  System.out.println(" economics  = " + eco );


   System.out.println("write the your marks in science " );
   sci =sc.nextInt();
  System.out.println(" science = " + sci );


    marks=eng+hin+maths+eco+sci; 
    System.out.println(" The total sum of = "+marks);  
   per = marks/5;
  System.out.println("  your percent is =   " +per+ "%" );


  }
  }