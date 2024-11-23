import java.util.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
				Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
	   for(int i=0;i<n;i++){
		    int a=sc.nextInt();
		    int b=sc.nextInt();
		    int c=sc.nextInt();
		    if((b/a)>c){
		        System.out.println(0);
		}
		else{
		    System.out.println(c-(b/a));
		}
		    
		}

	}
}