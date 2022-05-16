public class twoclas {
    public static void main(String[] args) {
        sam s1;
        s1=new sam();
        s1.test();
        s1.tes(3);
        s1.t3(-7);
        
    }
}

class sam{
    int a;
    private int b=7;
    public static void test(){
        System.out.println("hi");
    }
    public static void tes(int a){
        a=a;
        System.out.println(a);
    }

    public static void t3(int b)
    {
        if(b>0)
        {
            b=b;
            System.out.println(b);
        }
        else{
            System.out.println(b);
        }
    }

}
