package objectOrientedProgaming.arrays;

class Student{
    int rollNo;
    String name;
    int marks;
}

public class ArrayOfObjects {

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.rollNo = 1;
        s1.name = "madhu";
        s1.marks = 88;

        Student s2 = new Student();
        s2.rollNo = 2;
        s2.name = "krishna";
        s2.marks = 55;

        Student s3 = new Student();
        s3.rollNo = 3;
        s3.name = "siva";
        s3.marks = 70;

        Student[] students = new Student[3];
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;

        for(Student student : students){
            System.out.println(student.name + " : " + student.marks);
        }


    }
}
