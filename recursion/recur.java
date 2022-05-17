public class recur {
    public static void main(String[] args) {
        System.out.println("hi!");

        rec r1=new rec();
        r1.test();

        rec h1=new rec();
        h1.hello(5);
    }
}

class rec {
    public static void test()
    {
        System.out.println("Working ");
    }
    public static void hello(int n)
    {
        if(n==0)
        {
            return;
        }
        else
        {
            System.out.println("Hello world !");
            hello(n-1);
        }
        
    }
}