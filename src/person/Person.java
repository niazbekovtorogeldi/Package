package person;

public class Person {
    private final String name;
    private static  int age;
     public  void  working(){
         System.out.println("person is working");
     }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public Person(String name){
         this.name=name;

    }

    public String getName() {
        return name;
    }

    public static int getAge() {
        return age;
    }

    public static void setAge(int age) {
        Person.age = age;
    }

    @Override
    public String toString() {
        return getName()+",  age is:"+age;
    }
}
