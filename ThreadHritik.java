package Hritik;

class Hritik2 extends Thread{
    public void run(){
        for(int i=1;i<=5;i++){
            System.out.println("i"+i+" ");
        }System.out.println();
    }}
class Hritik3 extends Thread{
    public void run(){
        for(int j =1;j<=5;j++){
            System.out.println("j :"+j);
        }System.out.println();}}
class Hritik4 extends Thread{
    public void run(){
        for(int k=1;k<=5;k++){
            System.out.println("K :"+k);
        }System.out.println();}}

public class ThreadHritik {
    public static void main(String[] args) {
        Hritik2 h1= new Hritik2();
        Hritik3 h2= new Hritik3();
        Hritik4 h3= new Hritik4();
        h1.start();
        h2.start();
        h3.start();
    }}
