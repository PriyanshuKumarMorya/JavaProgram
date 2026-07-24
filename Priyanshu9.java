package JavaClassProblem;

class A{
    int a;
    int b;
    A(int i,int j){
        a = i;
        b = j;
    }
    void display(){
        System.out.println("Add two numbers : "+(a+b));
    }
}
public class Priyanshu9 {
    public static void main(String[] args) {
        A a = new A(2,3);
        a.display();

    }
}
