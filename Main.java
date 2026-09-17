import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int grade = scanner.nextInt();

        if (grade >= 90) {
            System.out.println("Excellent");
        } else if (grade >= 80) {
            System.out.println("Very Good");
        } else if (grade >= 75) {
            System.out.println("Passed");
        } else {
            System.out.println("Failed");
        }

        scanner.close();
    }
}
