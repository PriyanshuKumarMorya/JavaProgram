package Kumkum;

class Vehicles{
    void start(){
        System.out.println("Vehicles sound is very high");
    }
    void stop(){
        System.out.println("Vehicles one time come in public");
    }
}
class Car extends Vehicles{
    void sound(){
        System.out.println("Car sound less Other Vehicles");
    }
    void year(){
        System.out.println("Car frist time public 1532");
    }
}
class Bike extends Vehicles{
    void sound(){
        System.out.println("Bike sound less Car");
    }
    void year(){
        System.out.println("Bike frist time public 1832");
    }
}
public class Ritik {
    public static void main(String[] args){
        Car mycar = new Car();
        mycar.sound();
        mycar.start();

    }
}
