package person;

public class Prorrammer extends  Person{
    public Prorrammer(String name, int age) {
        super(name, age);
    }

    public Prorrammer(String name) {
        super(name);
    }

    @Override
    public void working() {
        System.out.println("works as a programmer");
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
