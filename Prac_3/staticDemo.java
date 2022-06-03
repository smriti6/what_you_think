public class staticDemo {
    static int a = 25;                // Static Data Member
    float b;                        // Non-Static Data Member
    staticDemo() {                    
        System.out.println("Inside the Constructor...");
    }
    public void m1() {
        System.out.println("Inside the NON STATIC Method...");
        System.out.println("Sum is : "+(a + 10));
    }
    public static void m2() {
        System.out.println("Inside the STATIC Method...");
        System.out.println("Sum is : "+(a + 20));
    }
    static {                                // STATIC block
        System.out.println("Inside the STATIC block...");
        a = 37;
    }
	{                                // Anonymous block
        System.out.println("Inside the Anonymous block...");
    }
    public static void main(String[] args) 
    {
        System.out.println("Inside the MAIN Method...");
        staticDemo sd = new staticDemo();
        sd.m1();                                // Non-static
        m1();
        m2();                                    // No problem
    }

}
