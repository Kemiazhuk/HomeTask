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

        Branching1 prog7 =new Branching1();
        boolean e =prog7.existenceTriangle();
        boolean r =prog7.rightTriangle();
        if ((e)&&(r)){
            System.out.println("Triangle exist and right");
        }else  if ((e)&&(!r)){
            System.out.println("Triangle exist but not right");
        }else System.out.println("Triangle does't exist");
        Branching2 prog8 =new Branching2();
        System.out.println("max(min(a,b),min(c,d))"+prog8.max());
        Branching3 prog9 = new Branching3();
        if (prog9.belongLine()) {
            System.out.println("3 points belong to the same line");
        } else {
            System.out.println("3 points do not belong to the same line" );
        }
        Branching4 prog10 = new Branching4();
        System.out.println(prog10.calc());
        Branching5 prog11 = new Branching5();
        System.out.println(prog11.calc());
        Cycles1 prog12 = new Cycles1();
        System.out.println("Sum = " + prog12.calc());
        Cycles2 prog13 = new Cycles2();
        prog13.calc();
        Cycles3 prog14 = new Cycles3();
        System.out.println("Sum = " + prog14.calc());
        Cycles4 prog15 = new Cycles4();
        prog15.calc();
        Cycles5 prog16 = new Cycles5();
        prog16.calc();
        Cycles6 prog17 = new Cycles6();
        prog17.calc();
        Cycles7 prog18 = new Cycles7();
        prog18.calc();
    }
}
