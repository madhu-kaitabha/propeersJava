package fileHandling;

import java.io.*;

class Student implements Serializable{
    private int id;
    private String name;
    transient private int age; // transient keyword is used to perform selective serailisation. here age will not have given value during serialization

    public Student(int id, String name, int age){
        super();
        this.id = id;
        this.name = name;
        this.age = age;
    }
    public void disp(){
        System.out.println("id : "+ id);
        System.out.println("name : "+ name);
        System.out.println("age :"+ age);
    }
}
public class SearlizationEx {
    public static void main(String[] args) {
//        Student s1 = new Student(1, "Rohan", 22);
//        s1.disp();
        try {
//            FileOutputStream  fos = new FileOutputStream("/Users/chalasanin.vc/Documents/Non-work/java-ghub/propeersJava/serial.txt");
//            BufferedOutputStream bos = new BufferedOutputStream(fos);
//            ObjectOutputStream oos = new ObjectOutputStream(bos);
//            oos.writeObject(s1);
//            System.out.println("please check the the file to see serialized object");
//            oos.close(); // bos closes automatically with this close
//            fos.close(); // bos closes automatically with this close
// uncomment for checking serialisation.
//
// below is code for de-serialisation
            FileInputStream fis = new FileInputStream("/Users/chalasanin.vc/Documents/Non-work/java-ghub/propeersJava/serial.txt");
            BufferedInputStream bis = new BufferedInputStream(fis);
            ObjectInputStream ois = new ObjectInputStream(bis);

            Student s2 = (Student) ois.readObject();
            s2.disp();
            ois.close();
            fis.close();


        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }


    }
}
