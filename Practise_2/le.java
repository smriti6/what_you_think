import java.util.Scanner;

public class le {
    public static void main(String[] args) {
        int b=2;
        System.out.println(b);
        Scanner sc =new Scanner(System.in);
        String [][] a=new String [2][2];
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<2;j++)
            {
                a[i][j]=sc.nextLine();
            }
        }

        for(int i=0;i<2;i++)
        {
            for(int j=0;j<2;j++)
            {
                System.out.print(a[i][j]);
            }
            System.out.println();
        }
    }
}
