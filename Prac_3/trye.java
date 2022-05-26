public class trye {
    public static void main(String[] args) {
        long [] arr={468,335,1,170,225,479,359,463,465,206,146,282,328,462,492,496,443,328,437,392,403,154,293,383,422,217,219,396,448,227,272,39,370,413,168,300,36,395,204,312,323};
        long N=41;
        //long [] arr={2,4,1,3,5};
        long a=0;
        for(int i=0;i<N;i++)
        {
            for(int j=i+1;j<N;j++)
            {
                if(arr[i]>arr[j])
                {
                    long t=arr[i];
                    arr[i]=arr[j];
                    arr[j]=t;
                    a++;
                }
            }
        }
        
        // System.out.println(a);

        // for(int i=0;i<N;i++)
        // {
        //     System.out.print(arr[i]+" ");
        // }

        // System.out.println();
        // System.out.println(3/2);

        int [] ar={4 ,4 ,6 ,1, 4, 7, 2, 1, 9, 1};
        for(int i=0;i<10;i+=2)
        {
            // System.out.println(i);
            for(int j=i;j<10;j++)
            {
                if(ar[i]%2!=0)
                {
                    int t=0;
                    t=ar[i];
                    ar[i]=ar[j];
                    ar[j]=t;
                }
            }
        }

        for(int i=0;i<10;i++)
        {
            System.out.println(ar[i]);
        }
    }
}
