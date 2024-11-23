import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int i=0;i<t;i++){
		    int x1=sc.nextInt();
		    int y1=sc.nextInt();
		    int x2=sc.nextInt();
		    int y2=sc.nextInt();
		    int a=Math.abs(x1-x2);
		    int b=Math.abs(y1-y2);
		    int sum=Math.max(a,b);
		    System.out.println(sum);
		}

	}
}
