package JavaClassProblem;

class College1 {
    public void display() {
        System.out.println("Coer College.");
    }
}

class Teacher extends College1 {
    @Override
    public void display() {
        System.out.println("Coer Teacher.");
    }
}

class Students extends College1 {
    @Override
    public void display() {
        System.out.println("Coer Students.");
    }
}

public class Priyanshu18 {
    public static void main(String[] args) {
        College1 c1 = new Students();
        College1 c2= new Teacher();
        c2.display();
        c1.display();
    }
}

