package person;

public class Driver extends  Person{
    public Driver(String name, int age) {
        super(name, age);
    }

    public Driver(String name) {
        super(name);
    }

    @Override
    public void working() {
        System.out.println("works as a taxi driver");
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
