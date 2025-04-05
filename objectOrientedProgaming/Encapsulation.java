package objectOrientedProgaming;

class Human {

    // private key word makes the variables private to the class.
    // object instances cannot directly access these variables(or fields)
    private String name;
    private int age;

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
public class Encapsulation {

    public static void main(String[] args) {
        Human h1 = new Human();
        h1.setAge(45);
        int age = h1.getAge();
        System.out.println(age);
    }
}
