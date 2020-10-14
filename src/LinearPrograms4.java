public class LinearPrograms4 {
    private String answer;

    public String calc() {
        Input newInput = new Input();
        System.out.print("a=");
        String a = newInput.inputStr();
        String b = a.substring(4)+"," +a.substring(0,3);
        System.out.println(b);

        return answer;
    }
}
