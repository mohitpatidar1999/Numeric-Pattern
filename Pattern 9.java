/*

666666
55555
4444
333
22
1

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
	            for(int j=1;j<=r+1-i;j++){
	                System.out.print(r+1-i);
	            }
	        System.out.println();
	    }
	    
	}	
}
