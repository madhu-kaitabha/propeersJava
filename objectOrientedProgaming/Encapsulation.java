package objectOrientedProgaming;

class Human {

    // private key word makes the variables private to the class.
    // object instances cannot directly access these variables(or fields)
    private String firstName;
    private int age;

    // overriding default constructor
    // here this keyword is not used because there are no local variables with same names
    Human(){
        age = 12;
        firstName = "Madhu";
    }

    // Parameterised constructor. using this keyword to differentiate between local method variable and instance variable
    Human(int age, String firstName){
        this.age = age;
        this.firstName = firstName;
    }

    // this represents current object. not the class. it represents current object instance.
    public void setAge(int age) {
        this.age = age;
    }

    public void setfirstName(String firstName) {
        this.firstName = firstName;
    }


    public String getfirstName() {
        return firstName;
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
