public class stringex {
    public static void main(String[] args) {
        String a[]={"1","2","3","004"};
        for(int i=0;i<4;i++)
        {
            System.out.println(a[i]);
        }

        System.out.println();

        for(int i=0;i<4;i++)
        {
            if(a[i]=="04")
            {
                System.out.println(a[i]);
            }
        }
    }
}
