import java.io.*;
import java.util.Scanner;

public class Parket {

    public static void main(String[] args) throws IOException {
        int tmp;
        try (Scanner in = new Scanner(new File("in.txt"))) {
            tmp = in.nextInt();
        }
        try (PrintWriter out = new PrintWriter(new FileWriter("out.txt"))) {
            long res = (long) ((4 * Math.pow(6, tmp / 2) + 1) / 5);

            if (tmp % 2 == 0)
                out.println(res);
            else
                out.println(0);
        }
    }
}
