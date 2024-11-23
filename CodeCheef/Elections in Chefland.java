
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
		    int count=0;
		    int []a=new int[n];
		    for(int j=0;j<n;j++){
		        a[j]=sc.nextInt();
		        if(a[j]>=x){
		            count++;
		        }
		    }
		    System.out.println(count);
		}

	}
}