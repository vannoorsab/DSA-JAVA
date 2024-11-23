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
		    System.out.println(N<=4?1:N%4==0?N/4:(N/4)+1);
		}

	}
}