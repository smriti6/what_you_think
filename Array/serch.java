import java.util.Scanner;

public class serch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("5. Write a Java program to test if an array contains a specific value. ");
        System.out.println("Enter size of array");
        int n=sc.nextInt();
        System.out.println("Enter element");
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter value to find");
        int f=sc.nextInt();
        boolean b=false;
        for(int i=0;i<n;i++){
            if(arr[i]==f){
                b=true;
            }
        }
        if(b){
            System.out.println("found");
        }
        else{
            System.out.println("not found");
        }

    }
}
