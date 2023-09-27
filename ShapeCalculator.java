import java.util.Scanner;

public class ShapeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("**********************************************");
        System.out.println("               SHAPE CALCULATOR               ");
        System.out.println("**********************************************");

        while (true) {
            System.out.println("Enter C for circle, R for rectangle, or T for triangle: ");
            String choice = scanner.nextLine().toUpperCase().trim();

            if (choice.equals("C")) {
                double radius = getDoubleInput("Enter the radius: ");
                double area = Math.PI * Math.pow(radius, 2);
                double circumference = 2 * Math.PI * radius;
                System.out.printf("The area of the circle is %.2f, and the circumference is %.2f%n", area, circumference);
            } else if (choice.equals("R")) {
                double length = getDoubleInput("Enter the length: ");
                double width = getDoubleInput("Enter the width: ");
                double area = length * width;
                double perimeter = 2 * (length + width);
                System.out.printf("The area of the rectangle is %.2f, and the perimeter is %.2f%n", area, perimeter);
            } else if (choice.equals("T")) {
                double side1 = getDoubleInput("Enter the length of side 1: ");
                double side2 = getDoubleInput("Enter the length of side 2: ");
                double side3 = getDoubleInput("Enter the length of side 3: ");
                double perimeter = side1 + side2 + side3;
                double s = perimeter / 2;
                double area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
                System.out.printf("The area of the triangle is %.2f, and the perimeter is %.2f%n", area, perimeter);
            } else if (choice.equals("Q")) {
                System.out.println("Thank you for using Shape Calculator!");
                break;
            } else {
                System.out.println("That is not a recognized shape.");
            }
        }
        
        scanner.close();
    }

    public static double getDoubleInput(String message) {
        Scanner scanner = new Scanner(System.in);
        double value;

        while (true) {
            try {
                System.out.print(message);
                value = scanner.nextDouble();
                break;
            } catch (java.util.InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid number.");
                scanner.nextLine();
            }
        }
        return value;
    }
}