package Assignment5_Strings;

public class Question1 {
    public static void main(String[] args) {
        System.gc();
        String s = new String("Hello");
        System.out.println("Memory available when new is used:" + Runtime.getRuntime().freeMemory());
        String s3 = new String("Hello");
        System.gc();
        String s1 = "Hello";
        System.out.println("Memory available without using new:" + Runtime.getRuntime().freeMemory());
        String s2 = "Hello";
        System.out.println(s1 == s2);
        System.out.println(s == s1);
        System.out.println(s == s3);
    }
}
