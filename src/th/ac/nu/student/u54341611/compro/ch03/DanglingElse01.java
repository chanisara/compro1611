package th.ac.nu.student.u54341611.compro.ch03;
 class DanglingElse01 {

     public static void main(String[] args) {
         int x = 5 ;
         if (x < 5){
             if (x > 5){
                 System.out.println('b');
             } else {
                 System.out.println('a');
            }
        }
    }
 }
