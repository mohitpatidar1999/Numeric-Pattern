/*

1
01
101
0101
10101

*/


import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    System.out.println("Enter no. of rows");
	    Scanner sc=new Scanner(System.in);
	    int r=sc.nextInt();
	    //int r=c*2;
	    int k;
	    for(int i=1;i<=r;i++){
	        if(i%2==0) k=0;
	        else k=1;
	            for(int j=1;j<=i;j++){
	                System.out.print(k);
	                if(k==0) k=1;
	                else k=0;
	            }
	                
	        System.out.println();
	    }
	    
	}	
}
