package basics.oopPractice;

public class LearnPolymorphism {
/*
2 Different types of Polymorphism
     1 - Compile-Time Polymorphism (Method Overloading)
     2 - *********************************************
 */

    public static void main(String[] args) {
        int x = addition(1,2,3,4);
    }
    public static int addition(int x, short y) {
        return x + y;
    }
    public static int addition(int x, int y, int z) {
        return x + y + z;
    }
    public static int addition(int a, int b, int c, int d) {
        return a + b + c + d;
    }
    public static int addition(int a, int b, int c, int d, int e){
        return a + b + c + d + e;
    }
}
