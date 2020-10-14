public class LinearPrograms2 {
    private double answer;

    public double calc() {
        Input newInput = new Input();
        System.out.print("a=");
        double a = newInput.inputDouble();
        System.out.print("b=");
        double b = newInput.inputDouble();
        System.out.print("c=");
        double c = newInput.inputDouble();
        answer = (b + Math.sqrt(Math.pow(b, 2) + 4*a *c)) / 2 * a - Math.pow(a, 3) * c + Math.pow(b, -2);
        return answer;
    }
}
