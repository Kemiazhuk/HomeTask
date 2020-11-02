package org.kemy;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

public class Input {
//    private double num;
//    private int numInt;
//    private BigInteger numBigInt;
//    private BigDecimal numBigDec;

    public static BigInteger inputBigInt() {

        BigInteger numBigInt= null;
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
    public static BigDecimal inputBigDec() {
        BigDecimal numBigDec=null;
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

    public static Double inputDouble() {
        Double num=0.0;
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

    public static int inputInt() {
        Integer numInt = 0;
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

    public static String inputStr() {
        Scanner scanner = new Scanner(System.in);

        String number = scanner.nextLine();

        return number;
    }
    public static char inputChar() {
        Scanner scanner = new Scanner(System.in);

        char num = scanner.next().charAt(0);

        return num;
    }
}

