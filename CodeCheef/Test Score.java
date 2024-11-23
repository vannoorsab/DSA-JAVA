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
		    int N=sc.nextInt();
		    int X=sc.nextInt();
		    int Y=sc.nextInt();
		    System.out.println(Y%X==0?"YES":"NO");
		}

	}
}