package chanung.submit01;

public class Submit01 {

    public static void main(String[] args) {
        // Q.01 ~ Q.03 풀기
        String name = "홍길동";
        int age = 26;
        double height = 177.9;

        // 수치, 계산 가능한 숫자들이 기본타입에 해당
        String phone = "01073987332";
        String email = "akow283@gmail.com";

        System.out.println("이름: " + name);System.out.println("나이: " + age);System.out.println("키: " + height);
        System.out.println("연락처: " + phone);
        System.out.println("이메일: " + email);


        String enigma = "너오구늘리뭐너먹구지리";

        String three = enigma.replace("너", "")
                .replace("구", "")
                .replace("리", "");

        System.out.println(three);


        String littlePrince = "나는 허영심 그때 아무것도 이해하지 못했어. 꽃의 말이 아닌 행동을 보고 판단했어야 했어. 내게 향기를 전해주고 즐거움을 주었는데, 그 꽃을 떠나지 말았어야 했어. 그 허영심 뒤에 가려진 따뜻한 마음을 보았어야 했는데, 그때 난 꽃을 제대로 사랑하기에는 아직 어렸던 거야.";

        String target = "허영심 뒤에 가려진 따뜻한 마음";

        System.out.println(littlePrince.indexOf(target));
        System.out.println(target.length());
        System.out.println(littlePrince.indexOf(target) + target.length());

        System.out.println(littlePrince.substring(littlePrince.indexOf(target), littlePrince.indexOf(target) + target.length()));


    }


}
