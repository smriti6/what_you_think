import java.util.*;

public class index {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Write a Java program to find the index of an array element. ");
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
                System.out.println("fount at "+i);
            }
        }
        // if(b){
        //     System.out.println("found");
        // }
        // else{
        //     System.out.println("not found");
        // }
    }
}
