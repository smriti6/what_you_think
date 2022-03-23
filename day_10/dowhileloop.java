import java.util.Scanner;
class dowhileloop {
    public static void main (String args []) {
        System.out.println("day 10");
        System.out.println("Program to print numbers ");
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter number");
        int a=sc.nextInt();

        int i=5;
        do
        {
            System.out.println(i);
            i++;
        }while(i<a);
    }
}