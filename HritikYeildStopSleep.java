package Hritik;

class Nin extends Thread{
    public void run(){
        for(int i=1;i<=5;i++){
            if(i==1){
//                yield( );
            }
            System.out.println(i);
        }
        System.out.println();
    }
}
class Nin1 extends Thread {
    public void run() {
        for (int j = 1; j <= 5; j++) {
            System.out.println(j);
            if (j == 3) {
                return;
            }
            System.out.println();
        }
    }
}
    class Nin2 extends Thread {
        public void run() {
            for (int k = 1; k <= 5; k++) {
                System.out.println(k);
                if (k == 1)
                    try {
                        sleep(1000);
                    } catch (Exception e) {

                    }
            }
            System.out.println();
        }
    }

    public class HritikYeildStopSleep {
        public static void main(String[] args) {
            Nin t1 = new Nin();
            t1.start();
            Nin1 t2 = new Nin1();
            t2.start();
//        Nin2 t3 = new Nin2();
//        t3.start();

        }
    }


//
//class Nin extends Thread {
//    public void run() {
//        for (int i = 1; i <= 5; i++) {
//            if (i == 1) {
//            }
//            System.out.println(i);
//        }
//        System.out.println();
//    }
//}
//
//class Nin1 extends Thread {
//    public void run() {
//        for (int j = 1; j <= 5; j++) {
//            System.out.println("J :"+j);
//            if (j == 3) {
//                // Use a flag or safe method to stop thread, stop() is deprecated
//                return;  // Safe way to exit the thread
//            }
//        }
//        System.out.println();
//    }
//}
//
//class Nin2 extends Thread {
//    public void run() {
//        for (int k = 1; k <= 5; k++) {
//            System.out.println("K :"+k);
//            if (k == 1) {
//                try {
//                    sleep(1000);  // Sleep for 1 second
//                } catch (InterruptedException e) {
//                    // Handle interruption
//                    System.out.println("Thread was interrupted.");
//                }
//            }
//        }
//        System.out.println();
//    }
//}
//
//public class HritikYeildStopSleep {
//    public static void main(String[] args) {
//        Nin t1 = new Nin();
//        t1.start();
//
//        Nin1 t2 = new Nin1();
//        t2.start();
//
//        Nin2 t3 = new Nin2();  // Corrected to use t3
//        t3.start();
//    }
//}
