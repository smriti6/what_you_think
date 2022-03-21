import java.util.Scanner;
class loop {
    public static void main (String args []) {
        System.out.println("day 8");
        System.out.println("Program to print numbers ");
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter number");
        int a=sc.nextInt();

        for(int i=1;i<=a;i++)
        {
            System.out.println(i);
        }
    }
}