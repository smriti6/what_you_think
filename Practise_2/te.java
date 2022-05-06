import java.util.Scanner; 
public class te {
     public static void main(String[] args) { 
         int salary=0,shifts=0; 
         double savings=0; 
         Scanner in=new Scanner(System.in); 
         salary = in.nextInt(); 
         shifts = in.nextInt(); 
         if(salary > 8000) 
            System.out.print("Salary too large "); 
         else if(shifts<0) 
            System.out.print ("Shifts too small\n"); 
         else if(salary<0) 
            System.out.print ("Salary too small"); 
         else { 
            savings = (salary*0.5)+(salary*0.02*shifts); 
            System.out.printf ("%.0f",savings); 
        } 
    } 
}