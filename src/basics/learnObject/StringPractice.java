package basics.learnObject;


public class StringPractice {

    public static void main(String[] args) {
        String phrase = "Every Good Bird Does Fly";
        String phrase2 = "Every Good Bird Does Not Fly";

        System.out.println(phrase);
        System.out.println(phrase.toLowerCase());
        System.out.println(phrase.toUpperCase());
        System.out.println(phrase.replace('e', 'z'));
        System.out.println(phrase.indexOf('F'));
        System.out.println(phrase.equals(phrase2));


    }
}
