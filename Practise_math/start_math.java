import java.util.Scanner;

public class start_math {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Count digit");
        System.out.println("Enter number");
        int n=sc.nextInt();
        int t=0;
        System.out.println("\n\n");
        while(n>0)
        {
            n=n/10; //divide number by 10 so it decrese by 1 or last number is deleted 
            //System.out.println(n);
            t++; //when a number is deleted t is increse by 1.
        }
        System.out.println(t);
    }   
}
