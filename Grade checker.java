import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your grade: ");
        int grade = scanner.nextInt();

        scanner.close();

        if (grade >= 90 && grade <= 100) {
            System.out.println("Excellent");
        } else if (grade >= 75 && grade < 90) {
            System.out.println("Passed");
        } else {
            System.out.println("Failed");
        }

      
    }
}
