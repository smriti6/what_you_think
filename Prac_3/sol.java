public class sol {
    public static void main(String[] args) {

        long arr[]={1,2,3,4,5,6};
        int n=6;
        // long a[]=new long [n];
        // int l=0;
        // int r=n-1;
        // while(l<r)
        // {
        //     a[l]=arr[r--];
        //     l+=2;
        //     // a[r]=arr[l];
        //     // r--;
        // }
        // while(r>l)
        // {
        //     a[r-1]=arr[l++];
        //     r-=2;
        // }
        // // for(int i=0;i<n;i++)
        // // {
        // //     a[i]=arr[i];
        // // }
        // for(int i=0;i<n;i++)
        // {
        //     System.out.println(a[i]);
        // }


        int l=0;
        int r=n-1;
        long max=arr[n-1]+1;
        
        for(int i=0;i<n;i++)
        {
            if(i%2==0)
            {
                arr[i]=arr[i]+arr[r]%max*max;
                r--;
            }
            else
            {
                arr[i]=arr[i]+arr[l]%max*max;
                l++;
            }
        }
        
        
        for(int i=0;i<n;i++)
        {
            arr[i]=arr[i]/max;
            System.out.println(arr[i]);
        }
    }
}
