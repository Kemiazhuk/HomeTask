public class Branching2 {
    public double min(double x, double y) {
        if (x > y) {
            return x;
        } else {
            return y;
        }
    }

    public double max() {
        Input newInput = new Input();
        System.out.print("a=");
        double a = newInput.inputDouble();
        System.out.print("b=");
        double b = newInput.inputDouble();
        System.out.print("c=");
        double c = newInput.inputDouble();
        System.out.print("d=");
        double d = newInput.inputDouble();
        if (min(a, b) > min(c, d)) {
            return min(a, b);
        } else {
            return min(c, d);
        }
    }
}
