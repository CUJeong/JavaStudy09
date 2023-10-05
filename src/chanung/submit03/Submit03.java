package chanung.submit03;

public class Submit03 {
    public static void main(String[] args) {
        // 팩토리얼
        long num = 1;
        for(int i = 1; i <= 15; i++){
            num *= i;
            System.out.println(i + ": " + num);
        }
        System.out.println(num);

        System.out.println("\n=========================\n");

        String findWally = "윌리울리일리울리울리일리월리일리윌리월리울리일리일리월리일리윌리일리윌리일리월리월리윌리울리윌리울리일리울리울리윌리일리";

        findWally.substring(0, 2);
        findWally.substring(1, 3);
        findWally.substring(2, 4);
        findWally.substring(3, 5);

        // findWally의 length는 60
        // 마지막 인덱스는 59
        findWally.substring(58, 60);  // 58부터 59까지 자름
//        findWally.substring(59, 61);  // 59부터 60까지 자름

        int count = 0;
        System.out.println(findWally.length());
        for(int i = 0; i < findWally.length() - 1; i++){
            //System.out.println(i);  // 마지막 i가 59 -> 마지막이 58이 되도록 수정
            //System.out.println(": " + findWally.substring(i, i+2));
            if(findWally.substring(i, i+2).equals("월리")){
                count++;
            }
        }
        System.out.println(count);

        System.out.println("\n=================================\n");

        String stars = "*****";

        // ***** -> stars.substring(0, 5) or stars.substring(0)
        // ****  -> stars.substring(1, 5) or stars.substring(1)
        // ***   -> stars.substring(2, 5) or stars.substring(2)
        // **
        // *

        for(int i = 0; i < 5; i++){
            System.out.println(stars.substring(i));
        }

        System.out.println("\n============================\n");

        String inputText = "내일부터 추석이당~";
        // -> ~당이석추 터부일내
        // ~ -> inputText.substring(9, 10)  i가 0일때 10
        // 당 -> inputText.substring(8, 9)  i가 1일때 9
        // 이 -> inputText.substring(7, 8)  i가 2일때 8
        // 내 -> inputText.substring(0, 1)  i가 3일때 7
//                                          i가 4일때 6 -> 10 - i
        System.out.println(inputText.length());  // 10글자
        String reverse = "";
        for(int i = inputText.length(); i > 0; i--){ // i는 10~1
            reverse += inputText.substring(i-1, i);
            System.out.println(i + ": " + reverse);
        }

        reverse = "";
        for(int i = 0; i < inputText.length(); i++){  // i는 0~9
            reverse += inputText.substring(9-i, 10-i);
            System.out.println(i + ": " + reverse);
        }

        reverse = "";
        for(int i = 0; i < inputText.length(); i++){  // i는 0~9
            System.out.println(i + ": " + inputText.substring(i, i+1));
            reverse = inputText.substring(i, i+1) + reverse;
            System.out.println(i + ": " + reverse);
        }


    }
}
