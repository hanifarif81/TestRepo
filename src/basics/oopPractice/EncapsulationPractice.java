package basics.oopPractice;

import basics.oopPractice.LearnEncapsulation;

public class EncapsulationPractice {
    public static void main(String[] args) {
// GETTER
    LearnEncapsulation le = new LearnEncapsulation();
        System.out.println(le.getAccountBalance());
// SETTER
        le.setAccountBalance(10000.00);
        System.out.println(le.getAccountBalance());
    }


}



