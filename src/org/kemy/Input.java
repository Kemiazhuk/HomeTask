package org.kemy;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

public class Input {
    private double num;
    private int numInt;
    private BigInteger numBigInt;
    private BigDecimal numBigDec;

    public BigInteger inputBigInt() {
        Scanner scanner = new Scanner(System.in);
        try {
            BigInteger number = new BigInteger(scanner.nextLine());
            numBigInt =number;
        } catch (Exception e) {
            System.out.println(e + "XX try again");
            inputBigInt();
        }
        return numBigInt;
    }
    public BigDecimal inputBigDec() {
        Scanner scanner = new Scanner(System.in);
        try {
            BigDecimal number = new BigDecimal(scanner.nextLine());
            numBigDec = number;
        } catch (Exception e) {
            System.out.println(e + "XX try again");
            inputBigDec();
        }
        return numBigDec;
    }

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
    public char inputChar() {
        Scanner scanner = new Scanner(System.in);

        char num = scanner.next().charAt(0);

        return num;
    }
}

