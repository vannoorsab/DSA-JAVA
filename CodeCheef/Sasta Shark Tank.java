
import java.lang.*;
import java.util.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scn=new Scanner(System.in);
		int t=scn.nextInt();
		for(int i=0;i<t;i++){
		    int a=scn.nextInt();
		    int b=scn.nextInt();
		    if(10*a>5*b){
		        System.out.println("FIRST");
		} if(5*b>10*a){
		    System.out.println("SECOND");
		}if(10*a==5*b){
		    System.out.println("ANY");
		}
	}
}}

	