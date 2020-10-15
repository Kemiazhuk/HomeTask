
public class Cycles4 {
    public long calc() {
        String prod1;
        String prod2;
        int next=0;
        int dop=0;
        prod1 = "1";
        for (int i = 1; i <= 200; i++) {
            int k = i * i;
            String square = Integer.toString(k);
            for (int j = square.length(); j > 0; j--) {
                dop=0;
                for (int l = prod1.length(); l > 0; l--) {
                    char squareSymbol = (square.charAt(j));
                    int first = (int)(squareSymbol);
                    char prodSymbol = (prod1.charAt(j));
                    int second = (int)(prodSymbol);
                    next = first*second/10;
                    int discharge = first*second-next*10+dop;
                    if (discharge>9){
                        discharge=discharge-10;
                        dop++;
                    }
                    dop+=next;
                }

            }
        }
        long rer = 0;
        return rer;

    }
}
