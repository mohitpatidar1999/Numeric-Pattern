/*

54321
4321
321
21
1

*/


import java.util.*;

public class Main
{
	public static void main(String[] args) {
		System.out.println("Enter no. of rows");
		Scanner sc=new Scanner(System.in);
		int r=sc.nextInt();
		for(int i=1;i<=r;i++){
		    for(int j=r+1-i;j>=1;j--){
		        System.out.print(j);
		    }
		    System.out.println();
		}
	}
}
