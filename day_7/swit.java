import java.util.Scanner;
class swit {
    public static void main (String args []) {
        System.out.println("day 7");
        System.out.println("Program to check Vowel or Consonant ");
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter alphabet\n");
        char a=sc.next().charAt(0);
        
        switch(a)
        {
            case 'a':
                System.out.println("a is vowel");
                break;
            case 'e':
                System.out.println("e is vowel");
                break;
            case 'i':
                System.out.println("i is vowel");
                break;
            case 'o':
                System.out.println("o is vowel");
                break;
            case 'u':
                System.out.println("u is vowel");
                break;

            default:
                System.out.println("it's consonant");


        }

    }
}