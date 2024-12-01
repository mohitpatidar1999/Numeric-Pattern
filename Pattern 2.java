/*

1
22
333
4444
55555

*/


import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    System.out.println("Enter no. of rows");
	    Scanner sc=new Scanner(System.in);
	    int r=sc.nextInt();
	    int c=r*2;
	    for(int i=1;i<=r;i++){
	        for(int j=1;j<=r;j++){
	            if(j>=1&&j<=i)
	            System.out.print(i);
	        }
	        System.out.println();
	    }
		
	}
}
