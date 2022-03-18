import java.util.Scanner;
class count {
    public static void main (String args []) {
        System.out.println("day 5");
        System.out.println("Program to print where to go ...");
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter your budget\n");
        int budget =sc.nextInt();
        if(budget>=5000)
        {
            System.out.println("You can go to Bali :)");
        }
        else
        {
            System.out.println("Why go anywhere just stay home and order some food ;)");
        }
    }
}