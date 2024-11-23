
import java.util.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int i=0;i<t;i++){
		    int x=sc.nextInt();
		    int y=sc.nextInt();
		    y-=x;
		    System.out.println(y%8==0?y/8:(y/8)+1);
		}

	}
}