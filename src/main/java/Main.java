import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
   Scanner input = new Scanner(System.in);
    System.out.print("Enter the first number: ");
    double num1 = input.nextDouble();
    System.out.print("Enter the second number: ");
    double num2 = input.nextDouble();
    System.out.print("Enter the third number: ");
    double num3 = input.nextDouble();
    displaySortedNumbers(num1, num2, num3);
  }
  public static void displaySortedNumbers(double num1, double num2, double num3) {
    if (num1 > num2) {
      double temp = num1;
      num1 = num2;
      num2 = temp;
    }
    if (num2 > num3) {
      double temp = num2;
      num2 = num3;
      num3 = temp;
    }
    if (num1 > num2) {
      double temp = num1;
      num1 = num2;
      num2 = temp;
    }
    System.out.println("The numbers in increasing order are: ");
    System.out.printf("%.2f %.2f %.2f\n", num1, num2, num3);
      }
}
      