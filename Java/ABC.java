import java.util.Arrays;
import java.util.Scanner;

public class ABC {
    public static void main(String[] args) {

        var scanner = new Scanner(System.in);

        int cases = scanner.nextInt();

        int[] num = new int[cases];
        for (int i=0; i<num.length; i++) {
            num[i] = scanner.nextInt();
        }
        Arrays.sort(num);

        char[] chArr = scanner.next().toCharArray();
        for (int i=0; i<chArr.length; i++) {

            System.out.print(num[chArr[i] - 'A'] + " ");
        }
    }
}
