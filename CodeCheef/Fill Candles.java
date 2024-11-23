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
		while(t-->0){
		    int n=sc.nextInt();
		    int k=sc.nextInt();
		    int m=sc.nextInt();
		    k=m*k;
	        if(n%k==0)
	        {
	            int c=(n/k);
	            System.out.println(c);
	        }
	        else{
	        int c=n/k;
	        System.out.println(c+1);
	    }
		}

	}
}
