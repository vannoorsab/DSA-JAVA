
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
		    int x=sc.nextInt();
		    int sum=0;
		    if(n>x){
		    sum=n-x;
		    }
		    else{
		    sum=x-n;
		    }
		    sum=Math.min(sum,x);
		   System.out.println(sum);
		}

	}
}