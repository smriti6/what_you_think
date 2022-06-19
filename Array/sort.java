import java.util.*;
public class sort {
    public static void main(String[] args) {
        System.out.println("1. Write a Java program to sort a numeric array and a string array");
        Scanner sc=new Scanner(System.in);
        System.out.println();
        System.out.println("1.Programm for int\n2.Programm for string");
        System.out.println("Enter your choois\n");
        int c=sc.nextInt();
        switch (c) {
            case 1:
                System.out.println("Enter array size");
                int n=sc.nextInt();
                System.out.println("Enter element");
                int [] arr=new int[n];
                for(int i=0;i<n;i++){
                    arr[i]=sc.nextInt();
                }
                System.out.println("After sorting\n");
                Arrays.sort(arr);
                for(int i=0;i<n;i++){
                    System.out.println(arr[i]);
                }

                break;

            case 2:
                System.out.println("Enter array size");
                int n1=sc.nextInt();
                System.out.println("Enter element");
                String [] ar=new String[n1];
                for(int i=0;i<n1;i++){
                    ar[i]=sc.nextLine();
                }
                System.out.println("After sorting\n");
                Arrays.sort(ar);
                for(int i=0;i<n1;i++){
                    System.out.println(ar[i]);
                }
                break;

            default:
                System.out.println("Invalid input");
                break;
        }

    }
    // 3. Write a Java program to print the following grid. 
    // 4. Write a Java program to calculate the average value of array elements
}
