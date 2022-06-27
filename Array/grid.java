import java.util.Scanner;

public class grid {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("3. Write a Java program to print the following grid.");
        // - - - - - - - - - -                                                                                           
        // - - - - - - - - - -                                                                                           
        // - - - - - - - - - -                                                                                           
        // - - - - - - - - - -                                                                                           
        // - - - - - - - - - -                                                                                           
        // - - - - - - - - - -                                                                                           
        // - - - - - - - - - -                                                                                           
        // - - - - - - - - - -                                                                                           
        // - - - - - - - - - -                                                                                           
        // - - - - - - - - - -  
        System.out.println("Enter size of grid");
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(" - ");
            }
            System.out.println();
        }

    }
}
