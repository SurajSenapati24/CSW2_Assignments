package Assignment3_ErrorHandling;

public class Q16 {
    public static void main(String[] args) {
        int arr[] = new int[5];
        try {
            System.out.println(arr[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }
        System.out.println("End of program");
    }
}
