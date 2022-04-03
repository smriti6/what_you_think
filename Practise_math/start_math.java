import java.util.Scanner;

public class start_math {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
       // count();
       //palindrome();
       prime();

    }   

    static void count()
    {
        System.out.println("Count digit");
        System.out.println("Enter number");
        int n=sc.nextInt();
        int t=0;
        System.out.println("\n");
        while(n>0)
        {
            n=n/10; //divide number by 10 so it decrese by 1 or last number is deleted 
            //System.out.println(n);
            t++; //when a number is deleted t is increse by 1.
        }
        System.out.println(t);
    }

    static void palindrome()
    {
        System.out.println("palindrome number");
        int n=sc.nextInt();
        int a=n;
        int t=0;
        while(a>0)
        {
            t=t*10+a % 10;
            a=a/10;
        }
        System.out.println(t);
        if(n==t)
        {
            System.out.println("palindrome");
        }
        else
        {
            System.out.println("not");
        }
    }

    static void prime()
    {
        System.out.println("Prime number");
        System.out.println("Enter number");
        int n=sc.nextInt();
        int t=0;
        int m=n/2;
        for(int i=2;i<m;i++)
        {
            if(n%i==0)
            {
                System.out.println("Not prime");
                t++;
                break;
            }
        }

        if(t==0)
        {
            System.out.println("prime");
        }
        
    }
}
