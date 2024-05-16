package Assignment3_ErrorHandling;

import java.lang.ClassNotFoundException;
import java.lang.NoSuchMethodException;
import java.lang.reflect.Method;

public class Q26 {
    public static void main(String[] args) {
        try {
            Class.forName("Q30");
        } catch (ClassNotFoundException e) {
            System.out.println(e);
        }

        try {
            Method m = Q26.class.getMethod("disp", String[].class);
        } catch (NoSuchMethodException e) {
            System.out.println(e);
        }
    }
}
