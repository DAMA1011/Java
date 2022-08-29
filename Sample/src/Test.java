import util.CountDown;

public class Test {
    private int i = 1;
    public static void main(String argv[]){
        int i = 2;
        CountDown countDown = new CountDown();
        countDown.run();
        Test s = new Test();
        s.print();
    }
    public static void print(){
        //System.out.println(i);
    }
}