//Pocketクラスを利用するプログラム
import java.util.function.*;

public class Main05 {

    public static void main(String[] args){
        Pocket<String> p = new Pocket<String>();
        p.put("1192");
        String s = p.get();
        System.out.println(s);

        IntBinaryOperator func = Main05::sub;

        int a = func.applyAsInt(5,3);
        System.out.println(func);
        System.out.println("5-3は" + a);
    }

    public static int sub(int a,int b){
        return a-b;
    }
}
