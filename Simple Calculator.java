import java.util.Scanner;

class Main {
public static void main(String[] args){
Scanner scanner = new Scanner(System.in);

System.out.print("Enter first number: ");
int x = scanner.nextInt();

System.out.print("Choose operation (+, -, *, /): ");
char operation = scanner.next().charAt(0);

System.out.print("Enter second number: ");
int y = scanner.nextInt();

int z = 0;

switch(operation) {
  case '+':
    z = x + y;
    System.out.println("Result: " + z);
    break;
  case '-':
    z = x - y;
    System.out.println("Result: " + z);
    break;
  case '*':
    z = x * y;
    System.out.println("Result: " + z);
    break;
  case '/':
    z = x / y;
    System.out.println("Result: " + z);
    break;
  default:
  System.out.println("Invalid input");
}

}
}
