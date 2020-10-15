public class Branching4 {
    private double min;
    private double max;

    public void compare(double x, double y, double z) {
        if ((x >= y) && (x >= z) && (y > z)) {
            min = z;
            max = y;
        } else if ((x >= y) && (x >= z) && (y <= z)) {
            min = y;
            max = z;
        } else if ((y >= x) && (y >= z) && (x > z)) {
            min = z;
            max = x;
        } else if ((y >= x) && (y >= z) && (x <= z)) {
            min = x;
            max = z;
        } else if ((z >= y) && (z >= x) && (x > y)) {
            min = y;
            max = x;
        } else if ((z >= y) && (z >= z) && (x <= y)) {
            min = x;
            max = y;
        }
    }

    public boolean calc() {
        Input newInput = new Input();
        System.out.print("Length hole A =");
        double a = newInput.inputDouble();
        System.out.print("Length hole B =");
        double b = newInput.inputDouble();
        System.out.print("Brick X = ");
        double x = newInput.inputDouble();
        System.out.print("Brick Y = ");
        double y = newInput.inputDouble();
        System.out.print("Brick Z = ");
        double z = newInput.inputDouble();
        compare(x, y, z);
        if ((Math.sqrt(a * a + b * b) - Math.sqrt(3) * min) >= max) {
            return true;
        } else {
            return false;
        }
    }
}
