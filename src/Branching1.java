public class Branching1 {
    private double a;
    private double b;
    public boolean rightTriangle(){

        if((a+b==90)||(a==90)||(b==90)){
            return true;
        } else{
            return false;
        }
    }
    public boolean existenceTriangle(){
        Input newInput = new Input();
        System.out.print("angle a=");
        a = newInput.inputDouble();
        System.out.print("angle b=");
        b = newInput.inputDouble();
        if (a+b<180){
            return true;
        } else {
            return false;
        }
    }
}
