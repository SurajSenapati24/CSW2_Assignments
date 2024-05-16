package Assignment6_Files;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

public class Question7 {
    public static void copyContent(File a, File b)
            throws Exception {
        FileInputStream in = new FileInputStream(a);
        FileOutputStream out = new FileOutputStream(b);
        try {
            int n;
            while ((n = in.read()) != -1) {
                out.write(n);
            }
        } finally {
            if (in != null) {
                in.close();
            }
            if (out != null) {
                out.close();
            }
        }
        System.out.println("File Copied");
    }

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the source filename from where you have to read/copy :");
        String a = sc.next();
        File x = new File(a);
        System.out.println("Enter the destination filename where you have to write/paste :");
        String b = sc.next();
        File y = new File(b);
        copyContent(x, y);
    }
}