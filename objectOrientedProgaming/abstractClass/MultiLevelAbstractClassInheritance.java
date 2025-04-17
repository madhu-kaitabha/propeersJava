package objectOrientedProgaming.abstractClass;
abstract class Truck{
    // An abstract class can have only abstract methods which are methods without definition.
    // Just declared methods with abstract keyword
    // An abstract class can have only normal implemented methods. these methods should not have abstract keyword in method signature
    // An abstract class can have both abstract and non-abstract methods
    // its compulsory to define all abstract methods in the subclass(or child class)
    abstract public void driveForward();
    abstract public void driveReverse();
    public void playMusic(){
        System.out.println("Playing rock music\nEnjoy!!!");
    }
}

// ========================
// a child abstract class doesn't have to implement  abstract methods of parent abstract class
abstract class Volvo extends Truck{

    abstract public void switchOnRearViewCamera();

    public void driveForward() {
        System.out.println("Driving...swwwyyyy!!!");
    }
}

// ========================
class UpdatedVolvo extends Volvo{

    public void driveReverse() {
        System.out.println("Reversing...swwwyyyy!!!");
    }

    @Override
    public void switchOnRearViewCamera() {
        System.out.println("Switched on rearview camera");
    }
}
public class MultiLevelAbstractClassInheritance {

    public static void main(String[] args) {
        Volvo volvoObj = new UpdatedVolvo();
        volvoObj.driveForward();
        volvoObj.driveReverse();
        volvoObj.switchOnRearViewCamera();
    }

}
