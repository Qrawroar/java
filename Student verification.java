import java.util.Scanner;

class Main {
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter your name: ");
    String name = scanner.nextLine();

    System.out.print("Enter your age: ");
    int age = scanner.nextInt();

    System.out.print("Are you a student?: );
    boolean isStudent = scanner.nextBoolean();

    // Name
    if (name.isEmpty()){
        System.out.println("Please enter your name!");
    } else {
        System.out.println("Hello " + name + "!");
    }



    // Age
   // >= 18 is the minimum, anything 18 and higher will print.
  // <= 18 is the maximum, anything 18 and lower will print.

    if (age >= 18){

    } 
    else if (age >= 0){

    }
    else if (age >= 60){

    }

  }
}
