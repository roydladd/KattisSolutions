import java.util.Scanner;

public class QuickEstimate {
    public static void main(String[] args) {

        var scanner = new Scanner(System.in);
        
        int cases = scanner.nextInt();
        scanner.nextLine();
        while (cases-- > 0) {
            System.out.println(scanner.nextLine().length());
        }
    }
}
