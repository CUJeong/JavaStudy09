package chanung.submit04;

import ch06_method.MethodMain;

import java.util.Scanner;

public class Submit04 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        // 엘리베이터A의 층
        int elevatorA = 10;
        // 엘리베이터B의 층
        int elevatorB = 4;

        while(true){
            System.out.println("========== 희영빌딩 엘리베이터 ==========");
            System.out.println("엘리베이터 A 위치: " + elevatorA);
            System.out.println("엘리베이터 B 위치: " + elevatorB);
            System.out.print("몇층에 계시나요? >>> ");

            // 층을 입력받기
            String inputText = scan.nextLine();  // "4", "q"

            if(inputText.equals("q")){
                break;
            }

            // inputText가 "4" 인 경우
            int floor = Integer.parseInt(inputText);

            // 입력받은 층에 대한 엘리베이터 A와의 위치 차이 구하기
            int diffA = Math.abs(elevatorA - floor);  // 10 - 8 = 2

            // 입력받은 층에 대한 엘리베이터 B와의 위치 차이 구하기
            int diffB = MethodMain.myAbs(elevatorB - floor);  // 4 - 8 = -4

            // A 위치차이와 B 위치차이의 크기를 비교해서
            // 크기가 더 작은 엘리베이터를 이동시킨다.
            if(diffA < diffB){
                System.out.println("엘리베이터 A가 " + floor + "층으로 이동합니다.");
                elevatorA = floor;
            }else if(diffA > diffB){
                System.out.println("엘리베이터 B가 " + floor + "층으로 이동합니다.");
                elevatorB = floor;
            }else {
                // 층수 차이가 같으면 위층에 있는 엘리베이터가 이동
                if(elevatorA > elevatorB){
                    System.out.println("엘리베이터 A가 " + floor + "층으로 이동합니다.");
                    elevatorA = floor;
                }else{
                    System.out.println("엘리베이터 B가 " + floor + "층으로 이동합니다.");
                    elevatorB = floor;
                }
            }


        }

    }

}
