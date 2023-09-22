package chanung.submit02;

import java.util.Scanner;

public class Submit02 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("이름 입력");
        System.out.print(">>> ");
        String name = scan.nextLine();

        System.out.println("국어 점수");
        System.out.print(">>> ");
        // 76 -> "76"
        String kor = scan.nextLine();

        System.out.println("영어 점수");
        System.out.print(">>> ");
        String eng = scan.nextLine();

        System.out.println("수학 점수");
        System.out.print(">>> ");
        String math = scan.nextLine();

        System.out.println("이름: " + name);
        System.out.println("국어: " + kor);
        System.out.println("영어: " + eng);
        System.out.println("수학: " + math);

        int intKor = Integer.parseInt(kor);
        int intEng = Integer.parseInt(eng);
        int intMath = Integer.parseInt(math);

        double avg = (double)(intKor + intEng + intMath) / 3;

        System.out.printf("평균: %.2f\n", avg);

        System.out.println("\n=========================\n");

        int example = 278;

        // 자동 형변환을 이용한 int -> String 변환
        String strEx = example + "";

        // "278"
        String str1 = strEx.substring(0, 1);  // "2"
        String str2 = strEx.substring(1, 2);  // "7"
        String str3 = strEx.substring(2, 3);  // "8"

        int int1 = Integer.parseInt(str1);  // 2
        int int2 = Integer.parseInt(str2);  // 7
        int int3 = Integer.parseInt(str3);  // 8

        int result = int1 + int2 + int3;
        System.out.println("결과는: " + result);

    }

}
