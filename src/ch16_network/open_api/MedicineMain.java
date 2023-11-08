package ch16_network.open_api;

import java.util.ArrayList;
import java.util.Scanner;

public class MedicineMain {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        MedicineService medicineService = MedicineService.getInstance();

        while(true){
            System.out.println("증상을 이야기해주세요 [종료: q]");
            System.out.print(">>> ");

            String keyword = scan.nextLine();

            if(keyword.equals("q")){
                break;
            }

            ArrayList<MedicineDTO> mediList = medicineService.searchMedicine(keyword);

            if(mediList.size() == 0){
                System.out.println("해당 증상에 대한 약이 없습니다.");
                continue;
            }

            System.out.println("약국에 가서 아래의 약들을 요청하세요.");
            for(int i = 0; i < mediList.size(); i++){
                System.out.println(mediList.get(i).getItemName());
            }

        }




    }

}
