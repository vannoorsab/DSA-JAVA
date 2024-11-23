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
		    int x=sc.nextInt();
		    int a=sc.nextInt();
		    int b=sc.nextInt();
		    System.out.println(a*1+b*2>=x?"Qualify":"NotQualify");
		}

	}
}