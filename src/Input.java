import java.util.Scanner;

public class Input {
    private double num;
    private int numInt;


    public double inputDouble() {
        Scanner scanner = new Scanner(System.in);
        try {
            double number = scanner.nextDouble();
            num = number;
        } catch (Exception e) {
            System.out.println(e + "XX try again");
            inputDouble();
        }
        return num;
    }

    public int inputInt() {
        Scanner scanner = new Scanner(System.in);
        try {
            int number = scanner.nextInt();
            numInt = number;
        } catch (Exception e) {
            System.out.println(e + "XX try again");
            inputInt();
        }
        return numInt;
    }

    public String inputStr() {
        Scanner scanner = new Scanner(System.in);

        String number = scanner.nextLine();

        return number;
    }
}

