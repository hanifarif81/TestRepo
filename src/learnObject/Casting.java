package learnObject;

public class Casting {
    /*
    Converting one data type to another data type
        - Widening - No data loss
        - Narrowing - Data loss
    */
    public static void main(String[] args) {
        // Narrowing
        long y = 5654456688989765L;
        int x = (int) y;

        // Widening
        int a = 5000;
        long b = a;

        System.out.println(y);
        System.out.println(x);

        System.out.println(a);
        System.out.println(b);

        // Wrapper classes - Primitive to Non-primitive and vice-versa
        String c = "10";
        String d = "15";

        short e = Short.valueOf(c);
        short f = Short.valueOf(d);

        System.out.println(c + d);

        int g = 5;
        int h = 10;

        String i = String.valueOf(g);
        String j = String.valueOf(h);

        System.out.println(g + h);
    }

}
