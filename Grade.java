
import java.util.Scanner;

public class Grade {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Grade in Subject 1: ");
        int subject1 = input.nextInt();

        System.out.println("Enter Grade in Subject 2: ");
        int subject2 = input.nextInt();

        System.out.println("Enter Grade in Subject 3: ");
        int subject3 = input.nextInt();

        int average = (subject1 + subject2 + subject3) / 3;

        System.out.println("\nAverage Grade: " + average);

        if (average >= 70) {
            System.out.println("Result: Passed");
        } else {
            System.out.println("Result: Failed");
        }

        input.close();
    }
}
