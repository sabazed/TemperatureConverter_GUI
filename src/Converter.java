import java.util.Scanner;

public class Converter {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Welcome to Temperature Converter!");
        System.out.println("==========================================");
        System.out.println("Please choose the type of the temperature:");
        printTypes();

        Temperature temperature;
        int type = scanner.nextInt();

        System.out.println("Enter the temperature value:");
        double value = scanner.nextDouble();

        if (type == 1) temperature = new Celsius(value);
        else if (type == 2) temperature = new Fahrenheit(value);
        else temperature = new Kelvin(value);

        System.out.println("Please enter the result temperature type:");
        printTypes();

        type = scanner.nextInt();
        System.out.println(temperature.convert(type));

    }

    private static void printTypes() {
        System.out.println("1. Celsius");
        System.out.println("2. Fahrenheit");
        System.out.println("3. Kelvin");
    }


}
