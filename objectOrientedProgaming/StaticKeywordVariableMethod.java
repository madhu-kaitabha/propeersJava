package objectOrientedProgaming;

public class StaticKeywordVariableMethod {

    // main method should be static because in order to start execution there should be method which can be called without instantiating an object.
    // static methods are called without any instantiation of object. static methods are called when classes get loaded in classloader
    public static void main(String[] args) throws ClassNotFoundException {

        //  had to give objectOrientedProgramming.Mobile bcz packageName.ClassName to find path of the class
     //   .forName("objectOrientedProgramming.Mobile");

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
