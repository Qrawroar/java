import java.util.Scanner;

class Main { 
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter your name: ");
    String name = scanner.nextLine();

    System.out.print("Enter your age: ");
    int age = scanner.nextInt();
    scanner.nextLine();

    System.out.print("Enter your gender: ");
    String gender = scanner.nextLine();

    System.out.print("Enter your address: ");
    String address = scanner.nextLine();
    
    scanner.close();
    System.out.println("");
    System.out.println("----- User Information -----");
    System.out.println("Name: " + name);
    System.out.println("Age: " + age);
    System.out.println("Gender: " + gender);
    System.out.println("Address: " + address);
  }
}
