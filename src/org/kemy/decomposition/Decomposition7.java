package org.kemy.decomposition;

public class Decomposition7 {

    public void sumFactorial(){
        Integer sumFac=0;
        for (int i=1; i<=9; i+=2){
            sumFac+=factorial(i);
        }
        System.out.println(sumFac);
    }

    public Integer factorial(int n) {
        Integer fact = 1;
        for (int i = 1; i < n; i++) {
            fact *=i;
        }
        return fact;
    }
}
