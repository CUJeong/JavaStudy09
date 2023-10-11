package chanung.submit07;

import java.util.ArrayList;
import java.util.Collections;

public class Submit07 {
    public static void main(String[] args) {
        // 정수를 담을 수 있는 ArrayList 선언
        ArrayList<Integer> intList = new ArrayList<>();

        // 10~20 랜덤숫자 10번 담기
        // = 랜덤숫자 생성하면서 담는 행동 10번 반복
        for(int i = 0; i < 10; i++){  // 10번 반복 for문
            // 10~20 랜덤숫자 생성
            // Math.random() : 0 ~ 1 사이의 소수 (1은 안나옴)
            // Math.random() * 10 : 0 ~ 10 사이의 소수 (10은 안나옴)
            // (int)(Math.random() * 10) : 0 ~ 9 사이의 정수
            // (int)(Math.random() * 10) + 10 : 10 ~ 19 사이의 정수
            // (int)(Math.random() * 11) + 10 : 10 ~ 20 사이의 정수
            // (int)(Math.random() * 45) + 1 : 1 ~ 45 사이의 정수
            // (int)(Math.random() * b - a + 1 ) + a : a ~ b 사이의 정수
            int rand = (int)(Math.random() * 11) + 10;

            // 생성된 숫자 intList에 담기
            intList.add(rand);
        }

        System.out.println(intList);

        System.out.println("\n========================\n");

        // 중복된 숫자를 제거

        // 새로운 리스트 생성
        ArrayList<Integer> newList = new ArrayList<>();

        // intList를 순회하는 for문
        for(int i = 0; i < intList.size(); i++){
            // newList에 intList의 값을 옮긴다.
            // 값을 옮길때 newList 안에 intList.get(i)의 값이 존재하는지 체크
            // 존재하지 않을때만 옮긴다.
            if(newList.contains(intList.get(i)) == false){
                // 값이 존재하지 않음
                newList.add(intList.get(i));
            }
        }
        System.out.println(newList);

        // 새로운 리스트 생성 없이 remove로 중복 제거
        for(int i = 0; i < intList.size(); i++){
            // i가 0일때, intList.get(0) 과 index 9,8,7,6,5,4,3,2,1 와 비교
            // i가 1일때, intList.get(1) 과 index 9,8,7,6,5,4,3,2 와 비교
            // i가 2일때, intList.get(2) 과 index 9,8,7,6,5,4,3 와 비교
            for(int k = intList.size()-1; k > i; k--){
                if(intList.get(i) == intList.get(k)){
                    intList.remove(k);
                }
            }
        }
        System.out.println(intList);

        System.out.println("\n===============================\n");

        Collections.sort(intList);
        System.out.println(intList);

        System.out.println("\n==============================\n");

        Collections.sort(intList, Collections.reverseOrder());
        System.out.println(intList);

        System.out.println("\n===============================\n");

        // 아내가 사고 싶은 제품  ["냉장고", "로봇청소기", "세탁기", "에어컨", "식기세척기"]
        ArrayList<String> wipeList = new ArrayList<String>();
        wipeList.add("냉장고");
        wipeList.add("로봇청소기");
        wipeList.add("세탁기");
        wipeList.add("에어컨");
        wipeList.add("식기세척기");

        // 남편이 사고 싶은 제품 ["노트북", "TV", "에어컨", "플레이스테이션", "로봇청소기"]
        ArrayList<String> husList = new ArrayList<>();
        husList.add("노트북");
        husList.add("TV");
        husList.add("에어컨");
        husList.add("플레이스테이션");
        husList.add("로봇청소기");

        System.out.println(wipeList);
        System.out.println(husList);

        // 서로 사고 싶은 물건 목록 (교집합)
        ArrayList<String> bothWant = new ArrayList<>();
        for(int i = 0; i < wipeList.size(); i++){
//            wipeList.get(i)
            // for문으로 husList를 순회해서
            // wipeList.get(i)와 같은게 존재하는지 비교
            for(int k = 0; k < husList.size(); k++){
                if(wipeList.get(i).equals(husList.get(k))){
                    bothWant.add(wipeList.get(i));
                }
            }
        }
        System.out.println(bothWant);

        // 서로 사고 싶은 물건 목록
        ArrayList<String> wantAll = new ArrayList<>();

        for(int i = 0; i < wipeList.size(); i++){
            wantAll.add(wipeList.get(i));
        }

        // wantAll.addAll(wipeList); 와 같다.

        // ["냉장고", "로봇청소기", "세탁기", "에어컨", "식기세척기"]
        // ["노트북", "TV", "에어컨", "플레이스테이션", "로봇청소기"]
        for(int i = 0; i < husList.size(); i++){
            // husList.get(i) 의 값이 wantAll 안에 없어야 추가
            boolean isContain = false;
            for(int k = 0; k < wantAll.size(); k++){
                if(wantAll.get(k).equals(husList.get(i)) == true){
                    isContain = true;
                }
            }
            // isContain 값이 false일때 husList.get(i) 를 wantAll에 추가
            if(isContain == false){
                wantAll.add(husList.get(i));
            }
        }
        System.out.println(wantAll);






    }

}
