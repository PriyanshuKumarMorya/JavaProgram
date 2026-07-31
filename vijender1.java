package Vijender;

import Hritik.*;

import MOM.*;

class Function1 extends Thread {
    @Override
    public void run() {
        System.out.println("Task");
    }
}
    class Function2 extends Thread
    {
    @Override
    public void run(){
        System.out.println("Tasks");

    }

}
public class vijender1 {
    public static void main(String[] args) {
        Function1 f = new Function1();
        f.start();
        Function2 f1 = new Function2();
        f1.start();



    }
}
