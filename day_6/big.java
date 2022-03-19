import java.util.Scanner;
class big {
    public static void main (String args []) {
        System.out.println("day 6");
        System.out.println("Program to print bigest of 3");
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter 3 numbers \n");
        int a =sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        System.out.println("the biggest number is");
        if(a>b && a>c)
        {
            System.out.println(a);
        }
        else if (b>c)
        {
            System.out.println(b);
        }
        else
        {
            System.out.println(c);
        }

    }
}