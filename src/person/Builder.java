package person;

public class Builder extends Person{
    public Builder(String name, int age) {
        super(name, age);
    }

    public Builder(String name) {
        super(name);
    }

    @Override
    public void working() {
        System.out.println("works for fast food");
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
