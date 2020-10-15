import java.util.ArrayList;
import java.util.List;

public class Cycles7 {
    List<Integer> numbers1 = new ArrayList<Integer>();
    List<Integer> numbers2 = new ArrayList<Integer>();
    public void calc(){
        boolean flag;
        Input newInput= new Input();
        System.out.print("Enter number first = ");
        int first = newInput.inputInt();
        System.out.print("Enter number second = ");
        int second = newInput.inputInt();
        System.out.print("first number have numerals ");
        while (first>0){
            flag=true;
            int k= first%10;
            first/=10;
            for (int i=0; i<numbers1.size();i++){
                if (k==numbers1.get(i)){
                    flag=false;
                }
            }if (flag){
                System.out.print(" "+ k);
                numbers1.add(k);
            }
        }
        System.out.println();
        System.out.print("second number have numerals ");
        while (second>0){
            flag=true;
            int k= second%10;
            second/=10;
            for (int i=0; i<numbers2.size();i++){
                if (k==numbers2.get(i)){
                    flag=false;
                }
            }if (flag){
                System.out.print(" "+ k);
                numbers2.add(k);
            }
        }

    }
}
