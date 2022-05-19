public class rec3 {
    public static void main(String[] args) {
        System.out.println("hi");

        System.out.println(way(4,3));
    }

    public static int way(int n,int m)
    {
        if(n==1 || m==1)
        {
            return 1;
        }
        return way(n-1,m)+way(n,m-1);
    }
}
