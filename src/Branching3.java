public class Branching3 {
    public boolean belongLine() {
        Input newInput = new Input();
        System.out.print("x1=");
        double x1 = newInput.inputDouble();
        System.out.print("y1=");
        double y1 = newInput.inputDouble();
        System.out.print("x2=");
        double x2 = newInput.inputDouble();
        System.out.print("y2=");
        double y2 = newInput.inputDouble();
        System.out.print("x3=");
        double x3 = newInput.inputDouble();
        System.out.print("y3=");
        double y3 = newInput.inputDouble();
        if ((x1 - x3) * (y2 - y3) - (x2 - x3) * (y1 - y3) == 0) {
            return true;
        } else {
            return false;
        }
    }
}
