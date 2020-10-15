public class Cycles2 {
    public void calc() {
        Input newInput = new Input();
        System.out.print("Enter segment boundary A = ");
        double a = newInput.inputDouble();
        System.out.print("Enter segment boundary B = ");
        double b = newInput.inputDouble();
        System.out.print("Enter step C = ");
        double c = newInput.inputDouble();
        while (a<=b) {
            if (a<=2){
                System.out.println("X = "+ a + " Y = " +(-a));
            } else {
                System.out.println("X = "+ a + " Y = " +a);
            }
            a=a+c;
        }
    }
}
