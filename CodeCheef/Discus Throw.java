import java.util.*;
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int i=0;i<t;i++){
		    int a=sc.nextInt();
		    int b=sc.nextInt();
		    int c=sc.nextInt();
		    int sum=0;
		    sum=Math.max(a,b);
		    sum=Math.max(sum,c);
		    System.out.println(sum);
		}

	}
}