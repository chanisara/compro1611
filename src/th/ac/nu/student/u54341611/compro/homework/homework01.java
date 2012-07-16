package th.ac.nu.student.u54341611.compro.homework;
import java.util.Scanner;
public class homework01 {
    
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       System.out.print("Enter Number:");
       int input = in.nextInt();
       System.out.println("Square is "+(input*input));
       System.out.println("Cube is "+(input*input*input));
       System.out.println("Fourth Power is "+ Math.pow(input,4));        
        
    }
}
