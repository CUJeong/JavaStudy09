package chanung.temp;

import java.util.ArrayList;

public class regionTest {
    public static void main(String[] args) {
        ArrayList<Region> regionList = new ArrayList<>();


        for(int i = 0; i < 25; i++){
            int minePercent = (int)(Math.random()*10);
            if(minePercent < 2){
                regionList.add(new Region(i, null, true));
            }else{
                regionList.add(new Region(i, null, false));
            }
        }

        for(int i = 0; i < regionList.size(); i++){

            System.out.print(regionList.get(i));

            if(i % 5 == 4){
                System.out.println();
            }
        }


    }
}
