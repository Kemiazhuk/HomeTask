public class LinearPrograms3 {
    private double answer;

    public double calc() {
        Input newInput = new Input();
        System.out.print("x=");
        double a = newInput.inputDouble();
        System.out.print("y=");
        double b = newInput.inputDouble();

        answer = (Math.sin(a) + Math.cos(b)) / (Math.cos(a) - Math.sin(b)) * Math.tan(a * b);
        return answer;
    }
}
