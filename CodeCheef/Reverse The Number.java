import java.lang.*;
import java.util.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int i=0;i<t;i++){
		    int n=sc.nextInt();
		    int sum=0;
		    while(n>0){
		      int   m=n%10;
		         sum=sum*10+m;
		        n/=10;
		    }
		    System.out.println(sum);
		}

	}
}