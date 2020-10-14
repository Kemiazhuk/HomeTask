public class Main {

    public static void main(String[] args) {

        LinearPrograms1 prog1 = new LinearPrograms1();
        System.out.println("z = " + prog1.calc());

        LinearPrograms2 prog2 = new LinearPrograms2();
        System.out.println("math expression is " + prog2.calc());

        LinearPrograms3 prog3 = new LinearPrograms3();
        System.out.println("math expression is " + prog3.calc());

        LinearPrograms4 prog4 = new LinearPrograms4();
        System.out.println("math expression is " + prog4.calc());

        LinearPrograms5 prog5 = new LinearPrograms5();
        System.out.println("time is " + prog5.calc());

        LinearPrograms6 prog6 = new LinearPrograms6();
        System.out.println(prog6.calc());
    }
}
