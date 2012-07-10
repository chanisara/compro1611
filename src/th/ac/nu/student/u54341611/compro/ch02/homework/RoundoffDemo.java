/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package th.ac.nu.student.u54341611.compro.ch02.homework;
   public class RoundoffDemo {
       public static void main(String[] args) {
       double price = 4.35;
       int cents = (int)(100*price); // Should be 100*4.35 = 435
       System.out.println(cents); // Prints 434!
    }
}

