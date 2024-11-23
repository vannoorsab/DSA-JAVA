
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
		    System.out.println(n<=10?"Lower Double":n<=15?"Lower Single":n<=25?"Upper Double":"Upper Single");
		}
		
	}
}