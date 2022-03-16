import java.util.Scanner;
class inp {
    public static void main (String args[]) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Day 3");
        System.out.println("Enter radius of a circle");
        int r=sc.nextInt();
        float p=3.14f;
        System.out.println("Area of circle = "+p*r*r);
    }
}