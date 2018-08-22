//list3-2 イテレータの取得
import java.util.ArrayList;
import java.util.Iterator;

public class Main04 {
    public static void main(String[] args){
        ArrayList<String> names = new ArrayList<String>();
        names.add("後藤");
        names.add("サイトウ");
        names.add("内藤");

        Iterator<String> it = names.iterator();
        while(it.hasNext()){
            String e = it.next();
            System.out.println(e);
        }
    }
}
