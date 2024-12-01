/*

12345
1234
123
12
1
1
12
123
1234
12345

*/

import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    System.out.println("Enter no. of rows");
	    Scanner sc=new Scanner(System.in);
	    int c=sc.nextInt();
	    int r=c*2;
	    int k=1;
	    for(int i=1;i<=r/2;i++){
	            for(int j=1;j<=c+1-i;j++)
	                System.out.print(j);
	                
	        System.out.println();
	    }
	    for(int i=c+1;i<=r;i++){
	            for(int j=1;j<=i-c;j++)
	                System.out.print(j);
	                
	        System.out.println();
	    }
	    
	}	
}
