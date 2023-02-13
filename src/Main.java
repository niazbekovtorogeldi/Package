import person.Builder;
import person.Driver;
import person.Person;
import person.Prorrammer;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Prorrammer java = new Prorrammer("torogeldi",16);
        System.out.println(java);
        java.working();
        Driver taksi = new Driver("Begaly",30);
        System.out.println(taksi);
        taksi.working();
        Builder builder =new Builder("Uson",19);
        System.out.println(builder);
        builder.working();



//        Circle c = new Circle(5);
//        System.out.println(Circle.area(c.radius));
//        System.out.println(Circle.circumference(c.radius));
    }
}
