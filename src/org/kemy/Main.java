package org.kemy;

import java.io.IOException;


public class Main {


    public static void main(String[] args) throws IOException {

//        LinearPrograms1 prog1 = new LinearPrograms1();
//        System.out.println("z = " + prog1.calc());
//
//        LinearPrograms2 prog2 = new LinearPrograms2();
//        System.out.println("math expression is " + prog2.calc());
//
//        LinearPrograms3 prog3 = new LinearPrograms3();
//        System.out.println("math expression is " + prog3.calc());
//
//        LinearPrograms4 prog4 = new LinearPrograms4();
//        System.out.println("math expression is " + prog4.calc());
//
//        LinearPrograms5 prog5 = new LinearPrograms5();
//        System.out.println("time is " + prog5.calc());
//
//        LinearPrograms6 prog6 = new LinearPrograms6();
//        System.out.println(prog6.calc());
//
//        Branching1 prog7 =new Branching1();
//        boolean e =prog7.existenceTriangle();
//        boolean r =prog7.rightTriangle();
//        if ((e)&&(r)){
//            System.out.println("Triangle exist and right");
//        }else  if ((e)&&(!r)){
//            System.out.println("Triangle exist but not right");
//        }else System.out.println("Triangle does't exist");
//        Branching2 prog8 =new Branching2();
//        System.out.println("max(min(a,b),min(c,d))"+prog8.solve());
//        Branching3 prog9 = new Branching3();
//        if (prog9.belongLine()) {
//            System.out.println("3 points belong to the same line");
//        } else {
//            System.out.println("3 points do not belong to the same line" );
//        }
//        Branching4 prog10 = new Branching4();
//        System.out.println(prog10.calc());
//        Branching5 prog11 = new Branching5();
//        System.out.println(prog11.calc());
//        Cycles1 prog12 = new Cycles1();
//        System.out.println("Sum = " + prog12.calc());
//        Cycles2 prog13 = new Cycles2();
//        prog13.calc();
//        Cycles3 prog14 = new Cycles3();
//        System.out.println("Sum = " + prog14.calc());
//        Cycles4 prog15 = new Cycles4();
//        prog15.calc();
//            Cycles5 prog16 = new Cycles5();
//            prog16.calc();
//        Cycles6 prog17 = new Cycles6();
//        prog17.calc();
//        Cycles7 prog18 = new Cycles7();
//        prog18.calc();
//        OneDimensional1 task1 = new OneDimensional1();
//        System.out.println(task1.sumMultipl());
//        OneDimensional2 task2 = new OneDimensional2();
//        System.out.println(task2.change());
//        OneDimensional3 task3 = new OneDimensional3();
//        task3.calc();

//        OneDimensional4 task4 = new OneDimensional4();
//        task4.calc();
//        OneDimensional5 task5 = new OneDimensional5();
//        task5.calc();
//        OneDimensional6 task6 = new OneDimensional6();
//        task6.calc();
//        OneDimensional7 task7 = new OneDimensional7();
//        task7.calc();
//        OneDimensional8 task8 = new OneDimensional8();
//        task8.calc();
//        OneDimensional9 task9 = new OneDimensional9();
//        task9.calc();
//        OneDimensional10 task10 = new OneDimensional10();
//        task10.calc();
//        ArraysOfArrays1 arr1 = new ArraysOfArrays1();
//        arr1.resolve();
//        ArraysOfArrays23 arr2 = new ArraysOfArrays23();
//        arr2.resolve();
//        ArraysOfArrays47 arr3 = new ArraysOfArrays47();
//        arr3.resolve();
//        ArraysOfArrays8 arr4 = new ArraysOfArrays8();
//        arr4.resolve();
//        ArraysOfArrays9 arr5 = new ArraysOfArrays9();
//        arr5.resolve();
//        ArraysOfArrays10 arr6 = new ArraysOfArrays10();
//        arr6.resolve();
//        ArraysOfArrays11 arr7 = new ArraysOfArrays11();
//        arr7.resolve();
//        ArraysOfArrays1213 arr8 = new ArraysOfArrays1213();
//        arr8.resolve();
//        ArraysOfArrays14 arr9 = new ArraysOfArrays14();
//        arr9.resolve();
//        ArraysOfArrays15 arr10 = new ArraysOfArrays15();
//        arr10.resolve();
//        ArraysOfArrays16 arr11 = new ArraysOfArrays16();
//        arr11.makeMagicSquare();
//        Test16 test =  new Test16();
//        test.testMagicSquare();
//        Sorting1 sort1 = new Sorting1();
//        sort1.addArray();
//        Sorting2 sort2= new Sorting2();
//        sort2.sortBySelect();
//        Sorting3 sort3= new Sorting3();
//        sort3.sortByChange();
//        Sorting4 sort4= new Sorting4();
//        sort4.sortByInsert();
//        Sorting5 sort5= new Sorting5();
//        sort5.sortByShel();
//        TestSort sor6 = new TestSort();
//        sor6.test();
//        Decomposition2 dec2 = new Decomposition2();
//        System.out.println(dec2.nodForFour(Input.inputInt(),Input.inputInt(),Input.inputInt(),Input.inputInt()));
//        Decomposition3 dec3 = new Decomposition3();
//        dec3.squareHexagon();
//        Decomposition4 dec4 = new Decomposition4();
//        dec4.find();
//        Decomposition5 dec5 = new Decomposition5();
//        dec5.secondMax();
//        Decomposition6 dec6 =new Decomposition6();
//        dec6.primeNumber();
//        Decomposition7 dec7 =new Decomposition7();
//        dec7.sumFactorial();
//        Decomposition8 dec8 =new Decomposition8();
//        dec8.task();
//        Decomposition9 dec9 =new Decomposition9();
//        dec9.task();
//        Decomposition10 dec10 =new Decomposition10();
//        dec10.task();
//        Decomposition11 dec11 =new Decomposition11();
//        dec11.task();
//        Decomposition12 dec12 =new Decomposition12();
//        dec12.task();
//        Decomposition13 dec13 = new Decomposition13();
//        dec13.task();
//        Decomposition14 dec14 = new Decomposition14();
//        dec14.task();
//        Decomposition15 dec15 = new Decomposition15();
//        dec15.task();
//        Decomposition16 dec16 = new Decomposition16();
//        dec16.task();
//        Decomposition17 dec17 = new Decomposition17();
//        dec17.task();
//        StringHomeTask1 str1 = new StringHomeTask1();
//        str1.task();
//        StringHomeTask2 str2 = new StringHomeTask2();
//        str2.task();
//        StringHomeTask3 str3 = new StringHomeTask3();
//        str3.task();
//        StringHomeTask4 str4 = new StringHomeTask4();
//        str4.task();
//        StringHomeTask5 str5 = new StringHomeTask5();
//        str5.task("   kgkk k k k k k k k k k hg hhkghl                    pppp    ");
//        StringChapter2Task1 str6 = new StringChapter2Task1();
//        str6.task();
//        StringChapter2Task2 str7 = new StringChapter2Task2();
//        str7.task();
//        StringChapter2Task3 str8 = new StringChapter2Task3();
//        str8.task();
//        StringChapter2Task4 str9 = new StringChapter2Task4();
//        str9.task();
//        StringChapter2Task5 str10 = new StringChapter2Task5();
//        str10.task();
//        StringChapter2Task6 str11 = new StringChapter2Task6();
//        str11.task();
//        StringChapter2Task7 str12 = new StringChapter2Task7();
//        str12.task();
//        StringChapter2Task8 str13 = new StringChapter2Task8();
//        str13.task();
//        StringChapter2Task9 str14 = new StringChapter2Task9();
//        str14.task();
//        StringChapter2Task10 str15 = new StringChapter2Task10();
//        str15.task();
//        StringApp str16= new StringApp();
//        str16.task();
//        StringAnalizator str17 = new StringAnalizator();
//        str17.task();



    }

}