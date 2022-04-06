import java.lang.reflect.Array;
import java.util.Arrays;

public class arr {
    public static void main(String[] args) {
        int ar[][]={{1,2,3},{3,2,1}};

        //method 1

        // for(int i=0;i<ar.length;i++)
        // {
        //     for(int j=0;j<ar[i].length;j++)
        //     {
        //         System.out.print(ar[i][j]+" ");
        //     }
        //     System.out.println();
        // }

        //methos 2
        // for(int i=0;i<ar.length;i++)
        // {
        //     System.out.println(Arrays.toString(ar[i]));
        // }
       

       //day2
       //leetcode
       //1672. Richest Customer Wealth
       int [][] accounts={{1,2,3},{3,2,1}};
        int t[]=new int [accounts.length];
        for(int i=0;i<accounts.length;i++)
        {
            for(int j=0;j<accounts[i].length;j++)
            {
                int x=accounts[i][j];
                //t+=x;
                t[i]=t[i]+x;
            }
        }
        // for(int z=0;z<4;z++)
        //     {
        //         System.out.println(t[z]);
        //     }
        Arrays.sort(t);
        //return t[accounts.length-1];
        System.out.println(t[t.length-1]);
        
        //method 2
        // 
        // int t=0;
        // int m=0;
        // int n=accounts.length;
        // for(int i=0;i<n;i++)
        // {
        //     t=0;
        //     for(int j=0;j<accounts[i].length;j++)
        //     {
        //         t+=accounts[i][j];
        //     }
        //     if(t>m)
        //         m=t;
        // }
        // System.out.println(m);
        
    }
}
