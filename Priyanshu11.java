package JavaClassProblem;

abstract class Village{
     public void people(){
        System.out.println("All people are good");
    }
}
 class VillageRoad extends Village{
    @Override
    public void people(){
        System.out.println("All people are walking easy ");
    }
}
 class Highway extends VillageRoad{
     @Override
     public void people (){
        System.out.println("hello");
    }

}

public class Priyanshu11 {
    public static void main(String[] args) {
        VillageRoad v2 = new VillageRoad();
        v2.people();
        Village v3= new Highway();
        v3.people();
    }
}
