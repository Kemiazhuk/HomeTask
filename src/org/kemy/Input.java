package org.kemy;

import com.oracle.tools.packager.IOUtils;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

public class Input {
    static Integer numInt = 0;
    static long numLong = 0;
//    private double num;
//    private int numInt;
//    private BigInteger numBigInt;
//    private BigDecimal numBigDec;

    public static BigInteger inputBigInt() {

        BigInteger numBigInt = null;
        Scanner scanner = new Scanner(System.in);
        try {
            BigInteger number = new BigInteger(scanner.nextLine());
            numBigInt = number;
        } catch (Exception e) {
            System.out.println(e + "XX try again");
            inputBigInt();
        }
        return numBigInt;
    }

    public static long inputLong() {

        Scanner scanner = new Scanner(System.in);
        try {
            long number = scanner.nextLong();
            numLong = number;
        } catch (Exception e) {
            System.out.println(e + "XX try again");
            inputInt();
        }
        return numLong;
    }

    public static BigDecimal inputBigDec() {
        BigDecimal numBigDec = null;
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
        Double num = 0.0;
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

    public static StringBuilder inputStrBuilder() {
        Scanner scanner = new Scanner(System.in);
        StringBuilder str = new StringBuilder(scanner.nextLine());
        return str;
    }


    public static char inputChar() {
        Scanner scanner = new Scanner(System.in);

        char num = scanner.next().charAt(0);

        return num;
    }

    public static StringBuilder inputStrFile() throws IOException {

        BufferedReader buffer = new BufferedReader(new FileReader("src/org/kemy/In.txt"));
        StringBuilder builder = new StringBuilder();
        String str = buffer.readLine();
        while (str != null) {
            builder.append(str);
            builder.append('\n');
            str = buffer.readLine();

        }

        buffer.close();

        return builder;
    }
}

