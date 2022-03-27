class function {
    public static void main(String args[]) {
        System.out.println("day 13");
        System.out.println("Addition "+add(4, 4));
        System.out.println("Substraction "+sub(10, 5));
        System.out.println("Multiplecation "+mul(5,3));
        System.out.println("Division "+div(10,5));
    }

    static int add(int a,int b) {
        return a+b;
    }
    static int sub(int a,int b) {
        return a-b;
    }
    static int mul(int a,int b) {
        return a*b;
    }
    static int div(int a,int b) {
        return a/b;
    }
}