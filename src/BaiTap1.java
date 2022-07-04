import java.util.Scanner;

public class BaiTap1 {
    public static void main(String[] args) {
        int choice;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Menu");
        System.out.println("1. Print the rectangle");
        System.out.println("2. Print the square triangle bottle left");
        System.out.println("3. Print the square triangle top left");
        System.out.println("4. Print isosceles triangle");
        System.out.println("0. Exit");
        System.out.println("Enter your choice: ");
        choice = scanner.nextInt();

        switch (choice) {
            case 1:
                for(int i = 0; i < 3; i++) {
                    for(int j = 0; j < 6; j++) {
                        System.out.print("*");
                    }
                    System.out.println("*");
                }
                break;
            case 2:
                for(int i = 1; i <= 5; i++) {
                    for(int j = 1; j < i; j++){
                        System.out.print("*");
                    }
                    System.out.println("*");
                }
                break;
            case 3:
                for(int i = 7; i >= 1; i--) {
                    for( int j = 1; j < i; j++) {
                        System.out.print("*");
                    }
                    System.out.println("*");
                }
                break;
            case 4:
                for(int i = 1; i <= 4; i++) {
                    for(int j = 1; j < i; j++){
                        System.out.print("*");
                    }
                    System.out.println("*");
                }
                for(int i = 3; i >= 1; i--) {
                    for( int j = 1; j < i; j++) {
                        System.out.print("*");
                    }
                    System.out.println("*");
                }
                break;
        }
    }
}
