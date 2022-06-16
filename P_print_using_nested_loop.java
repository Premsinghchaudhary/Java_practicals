package loops;

public class P_print_using_nested_loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int i,j;
        for( i=1;i<8;i++)
        {
        	for(j=1;j<6;j++) 
        	{
        	        if( i==1||i==4)
        	        {
        			
                  	
        	              	if( j==5)
                            {
                          	System.out.print(" ");
        		            }
        	              	else {
        	              		System.out.print("*");
        	              	}
        	        }
        	        else if( i==2||i==3)
        	        {
        	        	     if( j==1||j==5) {
        	        	    	 System.out.print("*");
        	        	     }
        	        	     else {
        	        	    	 System.out.print(" ");
        	        	     }
        	        }
        	        else
        	        { 
        	                 if( j==1) {
        	                	 System.out.print("*");
        	                 }
        	        	   
        	        }
        	}
        	System.out.println();
       }
        	              	
        			
  	}
}

       		
        			