import java.math.BigInteger;

public class Cycles4 {
    public void calc() {
        BigInteger num = new BigInteger("1");
        BigInteger rez = new BigInteger("0");
        for (int i = 1; i <= 200; i++) {
            BigInteger k = BigInteger.valueOf(i * i);

            num =(num.multiply(k));
            rez = rez.add(num);
        }
        System.out.println(num);
    }
}
