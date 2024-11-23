import java.lang.*;
import java.math.*;
import java.util.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
             Scanner sc = new Scanner(System.in);
             int t = sc.nextInt();
            while(t --> 0)
            {
                int n = sc.nextInt();
                BigInteger fact = new BigInteger("1");
                for(int i = 2; i <= n; i++)
                fact = fact.multiply(BigInteger.valueOf(i));
                System.out.println(fact);
            }
	    
	}
}