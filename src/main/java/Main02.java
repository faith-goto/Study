import java.time.*;

public class Main02 {
    public static void main(String[] args){
        //Instantの生成
        Instant i1 = Instant.now();

        Instant i2 = Instant.ofEpochMilli(31920291332L);
        long l = i2.toEpochMilli();

        //ZonedDatetime生成
        ZonedDateTime z1 = ZonedDateTime.now();
        System.out.println(z1);
        ZonedDateTime z2 = ZonedDateTime.of(2014,1,2,3,4,5,6,ZoneId.of("Asia/Tokyo"));

        //Instant　と　Zoneのそうごへんかん
        Instant i3 = z2.toInstant();
        ZonedDateTime z3 = i3.atZone(ZoneId.of("Europe/London"));

        //ZonedDateTimeの利用
        System.out.println("東京：" + z2.getYear() + z2.getMonth() + z2.getDayOfMonth());

        System.out.println("ロンドン：" + z3.getYear() + z3.getMonth() + z3.getDayOfMonth());

        if(z2.isEqual(z3)){
            System.out.println("これらは同じ瞬間をさしている");
        }
    }
}
