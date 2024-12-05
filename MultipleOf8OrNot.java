import java.util.*;
public class MultipleOf8OrNot
{
    public static void main(String[] args)
    {
        Scanner sc=new  Scanner(System.in);
        System.out.println("enter number of test case:");
        int t=sc.nextInt();
        for(int i=0; i<t; i++)
        {
            int n=sc.nextInt();
             if((n&7)==0)
                {
                    System.out.println("multiple of 8");
                }
            else
            {
                System.out.println("not multiple of 8");
            } 
          
        }
    }
}

 