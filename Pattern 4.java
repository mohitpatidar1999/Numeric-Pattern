/*

11
1221
123321
12344321
1234554321

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
	        int k=1;
	        for(int j=1;j<=i*2;j++){
	            if(j<=i)
	            System.out.print(k++);
	            else
	            System.out.print(--k);
	        }
	        System.out.println();
	    }
		
	}
}
