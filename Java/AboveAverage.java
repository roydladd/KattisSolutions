import java.util.Scanner;

public class AboveAverage {
    public static void main(String[] args) {

        var sc = new Scanner(System.in);

        int cases = sc.nextInt();
        while (--cases >= 0) {

            int students = sc.nextInt();
            int[] grades = new int[students];
            double avg = 0;
            for (int i = 0; i < students; i++) {
                grades[i] = sc.nextInt();
                avg += grades[i];
            }
            avg /= students;

            double aboveAvg = 0;
            double totalAboveAvg = 0;
            for (int x : grades) {
                if (x > avg) {
                    aboveAvg++;
                }
                totalAboveAvg = (aboveAvg / students) * 100;
            }

            System.out.printf("%.3f%s", (totalAboveAvg), "%\n");

        }
        sc.close();
    }
}
