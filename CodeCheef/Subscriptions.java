import java.util.*;


class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++){
		int A=sc.nextInt();
		int B=sc.nextInt();
		int C=sc.nextInt();
		int D=(A+B);
	//	if(D%2!=0){
	//	    D=D-1;
	//	}
		
		
	System.out.println(0.5*D>C?"YES":"NO");
		
		    
		}

	}
}