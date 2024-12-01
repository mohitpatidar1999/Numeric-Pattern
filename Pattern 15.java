/*

55555
45555
34555
23455
12345

*/

import java.util.*;

public class Main
{
	public static void main(String[] args) {
		System.out.println("Enter no. of rows");
		Scanner sc=new Scanner(System.in);
		int r=sc.nextInt();
		for(int i=1;i<=r;i++){
		    for(int j=1;j<=r;j++){
		        if(j>=1&&j<=i)
		        System.out.print(r-i+j);
		        else
		        System.out.print("5");
		    }
		    System.out.println();
		}
	}
}
