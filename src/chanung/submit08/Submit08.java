package chanung.submit08;

import java.util.*;

public class Submit08 {
    public static void main(String[] args) {
        ArrayList<Integer> myLotto  = makeLotto();
        System.out.println(myLotto);

        // 과연 로또를 몇장 구매해야 당첨이 될까?
        // 로또 시뮬레이션
        int[] winLotto = {11, 21, 22, 30, 39, 44};

        int num = 0;
//        while(true){
//            num++;
//
//            // 로또 한장 구매
//            ArrayList<Integer> lotto = makeLotto();
//
//            // winLotto와 lotto의 숫자 6개가 일치하는지 확인
//            // winLotto와 lotto의 각 인덱스 자리의 숫자가 일치하는 개수 카운트
//            int count = 0;
//            // {11, 21, 22, 30, 39, 44}
//            // [11, 21, 22, 30, 39, 44]
//            for(int i = 0; i < lotto.size(); i++){
//                if(winLotto[i] == lotto.get(i)){
//                    count++;
//                }
//            }
//
//            // 카운팅한 숫자 6개라면
//            // 당첨!!
//            if(count == 6){
//                System.out.println("당첨!!");
//                System.out.println(num + "회 구매");
//                System.out.println((num*1000L) + "원 씀");
//                break;
//            }else{
//                System.out.println(count + "개 맞춤. 현재 " + num + "회 구매");
//            }
//        }

        System.out.println("\n==============================\n");

        HashMap<String, String> infoMap = new HashMap<>();

        infoMap.put("a001", "1234a");
        infoMap.put("b001", "1234b");
        infoMap.put("c001", "1234c");
        infoMap.put("d001", "1234d");
        infoMap.put("e001", "1234e");

        Scanner scan = new Scanner(System.in);

        while(true){
            System.out.print("아이디 입력: ");
            String id = scan.nextLine();

            System.out.print("비밀번호 입력: ");
            String pw = scan.nextLine();

//            if(infoMap.get(id) != null){
//                // 아이디가 존재
//                if(infoMap.get(id).equals(pw)){
//                    // 로그인 성공
//                    System.out.println("로그인 성공");
//                    break;
//                }else{
//                    System.out.println("비밀번호가 틀렸습니다.");
//                }
//            }else{
//                // 아이디 없음
//                System.out.println("존재하지 않는 아이디입니다.");
//            }

            if(pw.equals(infoMap.get(id))){
                // 로그인 성공
                System.out.println("로그인 성공");
                break;
            }else{
                System.out.println("아이디 혹은 비밀번호가 틀립니다.");
            }

        }

    }

    public static ArrayList<Integer> makeLotto(){
        HashSet<Integer> temp = new HashSet<>();

        // 몇번 반복해서 집어넣기? - 애매
        while(temp.size() < 6){
            temp.add((int)(Math.random()*45) + 1);

            // temp의 사이즈가 6이 되었다면 반복종료
//            if(temp.size() == 6){
//                break;
//            }
        }

        // temp는 중복되지 않는 숫자 6개
        ArrayList<Integer> result = new ArrayList<>();

        result.addAll(temp);

        // 정렬
        // [ 4, 7, 2, 21, 34, 11]
        Collections.sort(result);

        return result;
    }

}
