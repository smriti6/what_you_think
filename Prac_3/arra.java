import java.util.Scanner;

public class arra {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a[]=new int [3];
        for(int i=0;i<3;i++)
        {
            a[i]=sc.nextInt();
        }
        for(int i=0;i<3;i++)
        {
            a[i]=a[i]+2;
            System.out.println(a[i]);
        }
    }
}
