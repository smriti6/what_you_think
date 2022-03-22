import java.util.Scanner;
class whileloop {
    public static void main (String args []) {
        System.out.println("day 9");
        System.out.println("Program to print numbers ");
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter number");
        int a=sc.nextInt();

        int i=1;
        while(i<=a)
        {
            System.out.println(i);
            i++;
        }
    }
}