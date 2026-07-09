package Interface;

class Student{
    int rollNumber;
    void getNumber(int n){
        rollNumber = n;
    }
    void putNumber(){
        System.out.println("roll number: "+rollNumber);
    }
}
class Test extends Student{
    float part1,part2;
    void getMarks(float m1,float m2){
        part1 = m1;
        part2 = m2;
    }
    void putMarks(){
        System.out.println("Part1 = "+part1);
        System.out.println("Part 2 = "+part2);
    }
}
interface Sports{
    float sportWt=6.07F;
    void putWt();

}
class Results extends Test implements Sports {
    float  total;
    public void putWt(){
        System.out.println("Sports wt :"+sportWt);
    }
    void display(){
        total = part1 + part2;
        putNumber();
        putMarks();
        putWt();
        System.out.println("Total score = "+total);
    }
}

public class Priyanshu1 {
    public static void main(String[] args) {
        Results students= new Results();
        students.getNumber(1234);
        students.getMarks(25.7F,333.87F);
        students.display();

    }
}
