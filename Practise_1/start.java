import java.util.Scanner;

public class start {
    public static void main(String[] args) {
        System.out.println("Practise questino Ans");

        //1. Write a program to print whether a number is even or odd, also take input from the user.
        System.out.println("1.print whether a number is even or odd, also take input from the user.");
        System.out.println("Enter a number");
        Scanner sc=new Scanner(System.in);
        // int n=sc.nextInt();
        // even_or_odd(n);

        // 2. Take name as input and print a greeting message for that particular name.
        System.out.println("2. Take name as input and print a greeting message for that particular name.");
        System.out.println("Enter Name");
        //String name=sc.nextLine();
        //greeting(name);
        
        // 3. Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest A = P(1 + rt)
        System.out.println("program to input principal, time, and rate (P, T, R) from the user and find Simple Interest");
        // int p=sc.nextInt();
        // int t=sc.nextInt();
        // int r=sc.nextInt();
        // System.out.println(simple_intrest(p, t, r));

        // 4. Take in two numbers and an operator (+, -, *, /) and calculate the value.
        System.out.println("Take in two numbers and an operator (+, -, *, /) and calculate the value.");
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        char s=sc.next().charAt(0);
        calculater(n1,n2,s);

// 5. Take 2 numbers as input and print the largest number.
// 6. Input currency in rupees and output in USD.
// 7. To calculate Fibonacci Series up to n numbers.
// 8. To find out whether the given String is Palindrome or not.
// 9. To find Armstrong Number between two given number.

    }
    static void even_or_odd(int a) 
    {
        if(a%2==0)
        {
            System.out.println("Given number is Even");
        }
        else
        {
            System.out.println("Given number is Odd");
        }
    }

    static void greeting(String a){
        System.out.println("Good morning "+a);
    }

    static int simple_intrest(int p,int t,int r)
    {
        int a=p*(1+(r*t));
        return a;
    }

    static void calculater(int n1,int n2,char s)
    {
        if(s=='+')
        {
            System.out.println(n1+n2);
        }
        else if(s=='-')
        {
            System.out.println(n1-n2);
        }
        else if(s=='*')
        {
            System.out.println(n1*n2);
        }
        else if(s=='/')
        {
            System.out.println(n1/n2);
        }
        else
        {
            System.out.println("your input is wrong ");
        }
    }

}
