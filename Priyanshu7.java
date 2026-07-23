package JavaClassProblem;
class Rohan99 {

    void student(){
        System.out.println("Rohan is coer university students ");
    }}
class  Nikhil extends Rohan99{

    void student(){
        System.out.println("Nikhil is coer university students");
    }
}
class Ritik extends Nikhil {
    void student(){
        System.out.println("Ritik is coer university students ");
    }
}

public class Priyanshu7 {
    public static void main(String[] args) {
        Rohan99 k1= new Nikhil();
        k1.student();
        Rohan99 k2 = new Ritik();
        k2.student();
    }
}
