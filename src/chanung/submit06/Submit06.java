package chanung.submit06;

import java.util.Arrays;

public class Submit06 {
    public static void main(String[] args) {
        String[] nameList = {"이정재", "김혜수", "이병헌", "송중기", "유아인", "류준열", "공유", "마동석", "이종석", "황정민", "박소담", "이선균", "이성민", "최민식", "이동휘", "권상우", "소지섭", "공효진", "조정석", "허성태", "이하늬"};

        int count = 0;
        for(int i = 0; i < nameList.length; i++){
            if(nameList[i].substring(0, 1).equals("이")){
                count++;
            }
        }
        System.out.println("이 씨 성을 가진 배우는 " + count + "명입니다.");

        System.out.println("\n=======================================\n");

        int[] intArr = {23, 456, 213, 32, 464, 1, 2, 4};

        Arrays.sort(intArr); // 오름차순 정렬  1, 2, 4, 23, 32, 213, 456, 464

        System.out.println("최솟값: " + intArr[0]);
        // 배열의 length - 1은 마지막 인덱스와 같다.
        System.out.println("최댓값: " + intArr[intArr.length - 1]);

        // {1, 2, 4, 464, 32, 213, 456, 4}
        int max = intArr[0];
        int min = intArr[0];
        for(int i = 1; i < intArr.length; i++){
            if(max < intArr[i]){
                max = intArr[i];
            }
            if(min > intArr[i]){
                min = intArr[i];
            }
        }
        System.out.println("최댓값: " + max);
        System.out.println("최솟값: " + min);

        System.out.println("\n===========================\n");

        // 1~45 사이의 랜덤숫자를 배열에 6개 담는다.
        // 중복된 숫자가 있으면 안된다.
        int[] lotto = new int[6];  // 4, 12, 23, 13, 34, 45
        // 6번 반복하는 for문 => 6자리 채워주기 위해
        // 몇번 반복해야하는지 애매한 상황 => while문
        for(int i = 0; i < lotto.length; i++){
            // 방금 생성된 랜덤 숫자 rand가 현재 lotto 배열 안에 들어있는지 체크
            int rand = (int)(Math.random()*45) + 1;

            for(int k = 0; k < lotto.length; k++){
                if(lotto[k] == rand){
                    // 방금 생성된 랜덤 숫자가 현재 배열 내에 존재함
                    i--;
                }
            }

            lotto[i] = rand;
        }

        int[] numArr = new int[6];
        int idx = 0;

        while(idx < 6){
            // 랜덤 숫자 생성
            int rand = (int)(Math.random()*45) + 1;

            // 랜덤 숫자가 현재 배열 내 존재하는지 체크
            boolean isDuple = false;
            for(int i = 0; i < numArr.length; i++){
                if(numArr[i] == rand){
                    // 랜덤 숫자가 현재 배열에 존재함
                    isDuple = true;
                }
            }
            // 위 for문이 끝날때까지 if문이 단 한번이라도 실행이 되었는지 체크
            // isDuple이 false일때 rand를 배열에 담기
            if(!isDuple){
                numArr[idx] = rand;
                idx++;
            }
        }

        int[] myLotto = makeLotto();
        for(int i = 0; i < myLotto.length; i++){
            System.out.print(myLotto[i] + " ");
        }


    } // main 끝

    public static int[] makeLotto(){
        int[] numArr = new int[6];
        int idx = 0;

        while(idx < 6){
            // 랜덤 숫자 생성
            int rand = (int)(Math.random()*45) + 1;

            // 랜덤 숫자가 현재 배열 내 존재하는지 체크
            boolean isDuple = false;
            for(int i = 0; i < numArr.length; i++){
                if(numArr[i] == rand){
                    // 랜덤 숫자가 현재 배열에 존재함
                    isDuple = true;
                }
            }
            // 위 for문이 끝날때까지 if문이 단 한번이라도 실행이 되었는지 체크
            // isDuple이 false일때 rand를 배열에 담기
            if(!isDuple){
                numArr[idx] = rand;
                idx++;
            }
        }

        // 오름차순 정렬
        Arrays.sort(numArr);

        return numArr;
    }



}
