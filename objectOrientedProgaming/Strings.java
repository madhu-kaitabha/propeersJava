package objectOrientedProgaming;

public class Strings {

    public static void main(String[] args) {
        // String literals
        // String is non-mutable in java
        // StringBuffer and StringBuilder are mutable. Both are same in functionality.
        // Only difference is StringBuilder is thread safe and StringBuffer is not thread safe

        String s1 = "Madhu";
        System.out.println(s1);
        System.out.println(s1.charAt(1));
        s1 = "Kaitabha";
        System.out.println(s1);

        StringBuffer sbuf1 = new StringBuffer("MadhuSudhana");
        System.out.println(sbuf1);
        System.out.println(sbuf1.capacity());
        sbuf1.append(", Madhava");
        System.out.println(sbuf1);
        System.out.println(sbuf1.capacity());



    }
}
