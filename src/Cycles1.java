public class Cycles1 {
    public int calc() {
        System.out.print("Enter number K = ");
        Input newInput = new Input();
        int k = newInput.inputInt();
        int sum = 0;
        for (int i = 1; i < k; i++) {
            sum += i;
        }
        return sum;
    }
}
