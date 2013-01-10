
import java.util.*;
class fact
{
   public static void main(String args[])
     {
       int n,f;
       System.out.println("Enter num to find factorial of:");
       Scanner s =new Scanner(System.in);
       n=s.nextInt();
       f=fact(n);
      System.out.println(" factorial = "+f);
      }
   public static int fact(int x)
    {
     if(x==0 ||x==1)
     return 1;
    else
    return(x*fact(x-1));
    }
}