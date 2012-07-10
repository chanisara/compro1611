/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package th.ac.nu.student.u54341611.compro.ch02.homework;

/**
 *
 * @author user
 */
public class ArrayPrinter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numbers[] = {1, 2, 3, 5, 8, 13};
        int index, initial = 0;
        for (index = initial; index < numbers.length; index++) {
        System.out.println("numbers[" + index + "] = " +
        numbers[index]);
    }
   }
}