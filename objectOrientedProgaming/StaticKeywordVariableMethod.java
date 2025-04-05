package objectOrientedProgaming;

public class StaticKeywordVariableMethod {

    public static void main(String[] args) throws ClassNotFoundException {

        //  had to give objectOrientedProgaming.Mobile bcz pacakageName.ClassName to find path of the class
     //   Class.forName("objectOrientedProgaming.Mobile");

        Mobile obj1 = new Mobile();
        obj1.brand = "iphone";
        obj1.price = 100000;
        Mobile.name = "Phone";

        Mobile obj2 = new Mobile();
        obj2.brand = "Samsung";
        obj2.price = 50000;
        Mobile.name = "Phone";

        obj1.show();
        obj2.show();

        Mobile.name = "smart phone";

        obj1.show();
        obj2.show();

        Mobile.show1(obj1);
        Mobile.show1(obj2);

    }
}
