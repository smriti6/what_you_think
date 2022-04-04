import java.util.Scanner;

public class start_math {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
       // count();
       //palindrome();
       //prime();
       int n[]={-1,-2,-3,-4,3,2,1};
       System.out.println(arraySign(n));

    }   

    static void count()
    {
        System.out.println("Count digit");
        System.out.println("Enter number");
        int n=sc.nextInt();
        int t=0;
        System.out.println("\n");
        while(n>0)
        {
            n=n/10; //divide number by 10 so it decrese by 1 or last number is deleted 
            //System.out.println(n);
            t++; //when a number is deleted t is increse by 1.
        }
        System.out.println(t);
    }

    static void palindrome()
    {
        System.out.println("palindrome number");
        int n=sc.nextInt();
        int a=n;
        int t=0;
        while(a>0)
        {
            t=t*10+a % 10;
            a=a/10;
        }
        System.out.println(t);
        if(n==t)
        {
            System.out.println("palindrome");
        }
        else
        {
            System.out.println("not");
        }
    }

    static void prime()
    {
        System.out.println("Prime number");
        System.out.println("Enter number");
        int n=sc.nextInt();
        int t=0;
        int m=n/2;
        for(int i=2;i<m;i++)
        {
            if(n%i==0)
            {
                System.out.println("Not prime");
                t++;
                break;
            }
        }

        if(t==0)
        {
            System.out.println("prime");
        }
        
    }

    public static int arraySign(int[] nums) {
        //         int t=1;
        //         int a=0;
        //         int s=0;
        //         int q=0;
        //         Arrays.sort(nums);
        //         int res = Arrays.binarySearch(nums, 0);
        //         boolean test = res > 0 ? true : false;
        //         if(test==true)
        //         {
        //             return 0;
        //         }
        //         else
        //         {
        //             for(int i=0;i<nums.length;i++)
        //             {
        //                     t*=nums[i];
        //                     if(nums[i]<0)
        //                     {
        //                         a++;
        //                     }
        //             }
        //         }
        //         if(a%2==0 )
        //         {
        //            q=1;
        //         }  
        //         if(a%2 !=0 ){
        //             q=-1;
        //         }
        //         return q;
                //int n=0,p=0,z=0;
                int t=1;
                for(int i=0;i<nums.length;i++)
                {
        //             if(nums[i]<0)
        //                 n++;
        //             if(nums[i]>=1)
        //                 p++;
        //             if(nums[i]==0)
        //                 z++;
                    
                    //method 2
                    // int c=t*nums[i];
                    // if(c==0)
                    //     return 0;
                    // if(c>0)
                    //     t=1;
                    // else
                    //     t=-1;
                    
                    if(nums[i]==0) {
                        return 0;
                    }else if(nums[i]<0) {
                        t = -t;
                }
                }
                // if(z>0)
                //     return 0;
                // else if(n%2!=0)
                //     return -1;
                // else
                //     return 1;
                return t;
                
            }
}
