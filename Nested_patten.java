package loops;

public class Nested_patten {

	public static void main(String[] args) {
		int i,j; // declared the variable
		for(i=1;i<=5;i++ ) //using nested loop
		{
			for(j=1;j<=i;j++ ) 
			{
				System.out.print("*" );
			}
			   System.out.println();    
		}

	}

}
