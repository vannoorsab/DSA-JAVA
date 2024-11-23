import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++){
		int p=sc.nextInt();
		int q=sc.nextInt();
		int r=sc.nextInt();
		int s=sc.nextInt();
		if(p>(q+r+s))System.out.println("YES");
		else if(q>(p+r+s))System.out.println("YES");
		else if(r>(p+q+s))System.out.println("YES");
		else if(s>(p+q+r))System.out.println("YES");
		else System.out.println("NO");
		}

	}
}