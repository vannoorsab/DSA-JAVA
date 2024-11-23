
import java.util.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner rizzu=new Scanner(System.in);
		int t=rizzu.nextInt();
		for(int i=0;i<t;i++){
		    int A=rizzu.nextInt();
		    int B=rizzu.nextInt();
		    int C=rizzu.nextInt();
		    System.out.println(A<=B&&B>=C?"YES":"NO");
		}

	}
}