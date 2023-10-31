package chanung.temp;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

public class UUIDStudy {
    public static void main(String[] args) {
        System.out.println(UUID.randomUUID().toString());

        SimpleDateFormat sdf = new SimpleDateFormat("yyMMddHHmmssSSS");
        String time = sdf.format(new Date());

        System.out.println(time);

        for(int i = 0; i < 6; i++){
            time += (int)(Math.random()*10);
        }

        System.out.println(time);


    }
}
