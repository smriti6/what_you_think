public class arr {
    public static void main(String[] args) {
        int ar[]={1,2,3,4,5};
        for(int i=1;i<ar.length;i++)
        {
            int t=ar[i];
            ar[i]=ar[i-1];
            ar[i-1]=t;
        }
        for(int i=0;i<ar.length;i++)
        {
            System.out.println(ar[i]);
        }
    }
}
