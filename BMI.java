import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        try (Scanner get = new Scanner(System.in)) {
            double weight, height, Meter, BMIresult;

            System.out.println("Enter your weight(in kg)");
            weight = get.nextDouble();

            System.out.println("Enter your height(in cm)");
            height = get.nextDouble();

            Meter = height / 100;

            BMIresult = weight / (Meter * Meter);
            System.out.printf("Your BMI index is: %f", BMIresult);

            if (BMIresult <= 15) {
                System.out.println("\nUnderWeight!");
            } else if (BMIresult <= 25 || BMIresult >= 16) {
                System.out.println("\nNormal Weight!");
            } else {
                System.out.println("\nOverWeight!");
            }
        } 
    }
}
