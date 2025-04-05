package objectOrientedProgaming;

class Shop{
    public void playMusic(){
        System.out.println("Playing music. Enjoy it !!!");
    }

    public String getMePen(int cost){
        if (cost >= 10){
            return "Pen";
        }else {
            return "Nothing";
        }
    }
}

public class FunctionsMethods {
    public static void main(String[] args) {
        Shop shopObj = new Shop();
        shopObj.playMusic();
        String shPen = shopObj.getMePen(10);
        System.out.println(shPen);

    }

}
