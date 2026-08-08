package Lecture;

class Priyanshu7{
    String name;
    int rollnumber;
    int cuid;
    String collagename;
    Priyanshu7(String name,int rollnumber,int cuid){
        this.name= name;
        this.rollnumber= rollnumber;
        this.cuid=cuid;
        }
        Priyanshu7(String name,String collagename,int cuid){
        this.name=name;
        this.collagename=collagename;
        this.cuid=cuid;
        }
        void display(){
            System.out.println("Your name is : "+name+" "+"Your roll number is: "+rollnumber+" "+"Your CU'id is : "+cuid+" "+"Your collage name is : "+collagename);

    }
}

public class Constructorthis {
    public static void main(String[] args) {
        Priyanshu7 p = new Priyanshu7("Priyanshu kumar",52,24220027);
        Priyanshu7 p1 = new Priyanshu7("Nikhil Kummar","Coer collage",24220027);
        p.display();
        p1.display();

    }
}
