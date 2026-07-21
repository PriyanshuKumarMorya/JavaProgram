package Lecture;

class Added{
    void onenumber(int a){
        System.out.println(a);
    }
}
class TwoAdded extends Added{
    void twonumber(int a, int b){
        super.onenumber(b);
        System.out.println(a+b);
    }
}
class ThreeAdded extends TwoAdded{
    void threenumber(int a, int b,int c){
        super.twonumber(a,b);
        System.out.println(a+b+c);
    }
}
public class ThisSuperConstruKeyUsed {
    public static void main(String[] args) {
        ThreeAdded t = new ThreeAdded();
        t.threenumber(4,5,6);

    }
}
