import java.util.Scanner;

public class PrintPolygon {
  public static void main(String[] args) {
    System.out.println("Menu");
    System.out.println("1. Print the rectangle");
    System.out.println("2. Print the square triangle (The corner is square at 4 different angles: top-left, top-right, botton-left, botton-right)");
    System.out.println("3. Print isosceles triangle");
    System.out.println("0. Exit");

    Scanner input = new Scanner(System.in);
    int choice;

    do {
      System.out.println("Enter your choice: ");
      choice = input.nextInt();
      makeAChoice(choice);
      System.out.println("\n");
    } while (choice != 0 );
  }

  public static void makeAChoice(int choice) {
    switch (choice) {
      case 1:
        System.out.println("Print the rectangle");
        for(int i=1; i<=3; i++) {
          for (int j = 1; j < 10; j++)
            System.out.print("* ");
          System.out.print("\n");
        }
        break;

      case 2:
        System.out.println("Print the square triangle (The corner is square at 4 different angles: top-left, top-right, botton-left, botton-right)");
        // bottom-left
        for(int i=1; i<=6; i++) {
          for (int j = 1; j <= i; j++)
            System.out.print("* ");
          System.out.print("\n");
        }
        System.out.println("\n");

        // top-left
        for(int i=6; i>=1; i--) {
          for (int j = 1; j <= i; j++)
            System.out.print("* ");
          System.out.print("\n");
        }
        System.out.println("\n");

        // top-right
        for (int i = 6; i >= 1; i--) {
          for (int k = 6 - i; k > 0; k--) {
            System.out.print("  ");
          }
          for (int j = 1; j <= i; j++) {
            System.out.print("* ");
          }
          System.out.print("\n");
        }
        System.out.println("\n");

        // bottom-right
        for (int i = 1; i <= 6; i++) {
          for (int k = 6 - i; k > 0; k--) {
            System.out.print("  ");
          }
          for (int j = 1; j <= i; j++) {
            System.out.print("* ");
          }
          System.out.print("\n");
        }
        break;

      case 3:
        System.out.println("Print isosceles triangle");
        for (int i = 1; i <= 6; i++) {
          for (int k = 6 - i; k > 0; k--) {
            System.out.print("  ");
          }
          for (int j = 1; j <= i; j++) {
            System.out.print("* ");
          }
          if (i==1) {
            System.out.print("\n");
            continue;
          }
          else {
            for (int l = 2; l <= i; l++)
              System.out.print("* ");
          }
          System.out.print("\n");
        }
        break;

      case 0:
        System.exit(0);
      default:
        System.out.println("No choice!");
    }
  }
}
