import java.util.Scanner;

public class sumArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("2. Write a Java program to sum values of an array.");
        System.out.println("Enter array size");
        int n=sc.nextInt();
        System.out.println("Enter array element");
        int arr[]=new int[n];
        int t=0;
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            t+=arr[i];
        }
        System.out.println("Total sum:");
        System.out.println(t);
    }
}
