import java.util.Scanner;

public class remove {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("7. Write a Java program to remove a specific element from an array. ");
        int a []={1,2,3,4};
        int n=4;
        for(int i=0;i<n;i++){
            if(a[i]==n){
                a[i]=a[i+1];
            }
        }
        for(int i=0;i<n;i++){
            System.out.println(a[i]);
        }
    }
}
