package basics.learnObject;

public class Parameters {
    public static void main(String[] args) {
        int x = subtraction(9,5,"We are subtracting integers");
        System.out.println(x);
    }
    public static int addition(int x, int y) {
        return x +y;
    }
    public static int subtraction(int x, int y,String massage){
        System.out.println(massage);
        return x -y;

    }

}
