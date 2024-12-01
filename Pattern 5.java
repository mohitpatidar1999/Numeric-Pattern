/*

1
2 3
4 5 6
7 8 9 10
11 12 13 14 15

*/

import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    System.out.println("Enter no. of rows");
	    Scanner sc=new Scanner(System.in);
	    int r=sc.nextInt();
	    int k=1;
	    for(int i=1;i<=r;i++){
	        
	        for(int j=1;j<=r;j++){
	            if(j<=i)
	            System.out.print(k++ +" ");
	            else
	            System.out.print(" ");
	        }
	        System.out.println();
	    }
		
	}
}
