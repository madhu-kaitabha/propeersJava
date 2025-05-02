package generics;

class Student<T>{

    T obj;

    Student(T obj){
        this.obj = obj;
    }

    public void disp(){
        System.out.println("Type of data passed here T : "+obj.getClass().getName());
    }

    public T getObj() {
        return obj;
    }
}
public class GenericClassDemo {
    public static void main(String[] args) {
        Student<Integer> st1= new Student<>(10);
        st1.disp();
        System.out.println(st1.getObj());

        Student<String> st2= new Student<>("Java");
        st2.disp();
        System.out.println(st2.getObj());
    }
}
