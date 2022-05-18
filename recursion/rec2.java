public class rec2 {

    public static int sum(int n)
    {
        if(n==1)
        {
            return 1;
        }
        return n+sum(n-1);
    }

    public static int power(int a,int b)
    {
        int t=0;
        if(b==0)
        {
            return 1;
        }
        return a*power(a, b-1);
    }
    public static void main(String[] args) {
        System.out.println("Hi !");

        System.out.println(sum(4));
        System.out.println(power(3, 4));
    }
}
