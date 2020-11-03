package org.kemy.decomposition;

import org.kemy.Input;

public class Decomposition6 {
    public void primeNumber (){
        System.out.println("Enter three numbers ");
        int a = Input.inputInt();
        int b = Input.inputInt();
        int c = Input.inputInt();
        if ((Decomposition1.findNod(a,b) == 1 ) &&
                (Decomposition1.findNod(a,c)==1 ) &&
                    (Decomposition1.findNod(b,c) == 1 )){
            System.out.println("Yes");
        } else{
            System.out.println("No");
        }

    }
}
