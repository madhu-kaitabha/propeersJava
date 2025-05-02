package generics;


import java.util.ArrayList;

class Human {
    public void sleep(){
        System.out.println("Human need to sleep well");
    }
}
class Employee extends Human{

    public void sleep() {
        System.out.println("Employee need to sleep well to stay productive");
    }
}


public class WildCardUpperLowerBoundsDemo {
    public static void main(String[] args) {
        Human human = new Human();
        Employee emp = new Employee();
        human = emp; // as per java oop concepts runtime polymorphism - child object can be assigned to a reference variable of Parent Type(here human type)

/*        ArrayList<Human>  humanList = new ArrayList<>();

      ArrayList<Employee> empList = new ArrayList<>();

      humanList = empList; //compile time error. collections doesn't allow runtime polymorphism - a child type Collection cannot be assigned to a reference variable of parent type Collection

        ArrayList<Human> humanList2 = new ArrayList<>();
        humanList = humanList2; // no error since both collections are of same type
*/

/*

        ArrayList<?>  humanList = new ArrayList<>(); // type is not specified. ? says it can be any type

        ArrayList<Employee> empList = new ArrayList<>();

        humanList = empList; // because humanList collection reference variable is of unknown type, empList can be assigned to it
        ArrayList<Human> humanList2 = new ArrayList<>();
        humanList =  humanList2;
*/

        //=====================IMPORTANT==================
        // Only wildcard(?) doesnt make any sense. Both upperbound and LowerBound of the wildcard are necessary for proper usage
        //===============================================
/*

        // LowerBound - child types of the wildcard or the same type
        ArrayList<? extends Human>  humanList = new ArrayList<>(); // all the child type collections can be assigned to humanList as wild card indicated all the types that extend Human
        ArrayList<Employee> empList = new ArrayList<>();
        ArrayList<Human> humanList2 = new ArrayList<>();
        ArrayList<String> stringList = new ArrayList<>();
        ArrayList<Object> objectList = new ArrayList<>();
        humanList = empList; // because humanList collection reference variable is of wild card extending Human type, empList can be assigned to it
        humanList =  humanList2;
//        humanList = stringList; // since String type is not a child type of Human. so stringList cant be assigned to humanList. compile time error is thrown here
//        humanList = objectList; // Object type is not child of Human
*/
        // UpperBound - parent types of the wildcard or the same type
        ArrayList<? super Human>  humanList = new ArrayList<>(); // all the parent type collections can be assigned to humanList as wild card indicated all the types that are super to Human
        ArrayList<Employee> empList = new ArrayList<>();
        ArrayList<Human> humanList2 = new ArrayList<>();
        ArrayList<String> stringList = new ArrayList<>();
        ArrayList<Object> objectList = new ArrayList<>();
//        humanList = empList; // because humanList collection reference variable is of super type of Human, empList cannot be assigned to it
        humanList =  humanList2; // humanList2 is of same type which is Human
//        humanList = stringList; // since String type is not an parent type of Human. stringList cant be assigned to humanList. compile time error is thrown here
        humanList = objectList; // Object type is parent of Human







    }
}
