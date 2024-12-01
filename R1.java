import java.util.Scanner;

public class R1 {
    public static void inputAllBaseTypes() {
            Scanner scanner = new Scanner(System.in);


            System.out.print("Enter a byte value: ");
            byte byteValue = scanner.nextByte();
            System.out.println("Byte value: " + byteValue);


            System.out.print("Enter a short value: ");
            short shortValue = scanner.nextShort();
            System.out.println("Short value: " + shortValue);


            System.out.print("Enter an integer value: ");
            int intValue = scanner.nextInt();
            System.out.println("Integer value: " + intValue);


            System.out.print("Enter a long value: ");
            long longValue = scanner.nextLong();
            System.out.println("Long value: " + longValue);


            System.out.print("Enter a float value: ");
            float floatValue = scanner.nextFloat();
            System.out.println("Float value: " + floatValue);


            System.out.print("Enter a double value: ");
            double doubleValue = scanner.nextDouble();
            System.out.println("Double value: " + doubleValue);


            System.out.print("Enter a character: ");
            char charValue = scanner.next().charAt(0);
            System.out.println("Character: " + charValue);


            System.out.print("Enter a boolean value (true/false): ");
            boolean booleanValue = scanner.nextBoolean();
            System.out.println("Boolean value: " + booleanValue);

            scanner.close();
        }

    public static void main(String[] args) {

        inputAllBaseTypes();
    }
    }

