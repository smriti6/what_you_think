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
    //    int [][] accounts={{1,2,3},{3,2,1}};
    //     int t[]=new int [accounts.length];
    //     for(int i=0;i<accounts.length;i++)
    //     {
    //         for(int j=0;j<accounts[i].length;j++)
    //         {
    //             int x=accounts[i][j];
    //             //t+=x;
    //             t[i]=t[i]+x;
    //         }
    //     }
    //     // for(int z=0;z<4;z++)
    //     //     {
    //     //         System.out.println(t[z]);
    //     //     }
    //     Arrays.sort(t);
    //     //return t[accounts.length-1];
    //     System.out.println(t[t.length-1]);
        
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


        //1572. Matrix Diagonal Sum
        //int [][] nums={{1,2,3},{4,5,6},{7,8,9}};

        //method 1 only print i:
        // int sum=0;
        // for(int i=0;i<nums.length;i++)
        // {
        //     for(int j=0;j<nums[i].length;j++)
        //     {
        //         if(i==j)
        //         {
        //             System.out.print(nums[i][j]);
        //         }
        //         else
        //         {
        //             System.out.print(" ");
        //         }
        //     }
        // }

        //method 2: print mid term 2 time 

        // for(int i=0;i<nums.length;i++)
        // {
        //     System.out.print(nums[i][i]+" ");
        //     System.out.print(nums[i][nums.length-i-1]+" ");
        // }

        // for(int i=0;i<nums.length;i++)
        // {
        //     for(int j=0;j<nums.length;j++)
        //     {
        //         if(i==j || i+j==nums.length-1)
        //         // sum+=nums[i][j];
        //         System.out.print(nums[i][j]);
        //         else{
        //             System.out.print(" ");
        //         }
        //     }
        //     System.out.println();
        // }

        //1678. Goal Parser Interpretation
        // String c="G()(al)";
        // c=c.replace("()","o");
        // c=c.replace("(al)","al");
        // // return c;
        // System.out.println(c);
    

        //1. Two Sum
        
        // int [] nums ={2,7,11,15};
        // int target =9;
        // int []t={0,0};
        
        // for(int i=0;i<nums.length;i++)
        // {
        //     for(int j=i+1;j<nums.length;j++)
        //     {
        //         if(nums[i]+nums[j]==target)
        //         {
        //             t[0]=i;
        //             t[1]=j;
        //             //break;
        //         }
        //     }
        // }
        // System.out.println(t[0]+" "+t[1]);


        //66. Plus One
        
        int [] digits={1,2,3};
        int t=digits[digits.length-1];
        t+=1;
        digits[digits.length-1]=t;
        System.out.println(digits[2]);
    }
}
