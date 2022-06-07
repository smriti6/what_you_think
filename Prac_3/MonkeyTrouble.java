import java.util.Scanner;
public class MonkeyTrouble {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("start");
        boolean a=sc.nextBoolean();
        boolean b=sc.nextBoolean();
        boolean t=isTrouble(a, b);
        System.out.println(t);
    }
    static boolean isTrouble(boolean aSmile, boolean bSmile)
    {
        if(aSmile==bSmile)
        {
            return true;
        }
        else{
            return false;
        }
    }
}
