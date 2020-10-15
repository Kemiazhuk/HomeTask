public class Branching5 {
    public double calc() {
        Input newInput = new Input();
        System.out.print("X =");
        double x = newInput.inputDouble();
       if (x>3){
           return (1/(x*x*x+6));
       }else {
           return (x*x-3*x+9);
       }
    }
}
