
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
		    int m=sc.nextInt();
		    if(m>=n)
		    System.out.println(n);
		    else
		    System.out.println((n-m)+n);
		}

	}
}