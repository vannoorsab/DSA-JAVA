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
		    int x=sc.nextInt();
		    int y=sc.nextInt();
		    int z=sc.nextInt();
		   // System.out.println(x%3==)
		   if(x % 3 != 0){
		        int Br = x / 3;
		        System.out.println(x*y + (Br*z));
		        
		    }else if(x % 3 == 0){
		        int Br = (x / 3) - 1;
		        System.out.println(x*y + (Br*z));
		        
		    }else{
		        System.out.println(x*y);
		    }
		}

	}
}
