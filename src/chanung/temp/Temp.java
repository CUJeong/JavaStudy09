package chanung.temp;

import java.util.Scanner;

public class Temp {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("재미있네요\n" +
                "￣￣￣￣￣ヽ___ノ￣￣￣￣￣￣￣￣￣\n" +
                "        Ｏ\n" +
                "         o\n" +
                "        ,. ─冖'⌒'─､\n" +
                "       ノ       ＼\n" +
                "       / ,r‐へへく⌒'￢､  ヽ\n" +
                "      {ノ へ._、 ,,／~`  〉 ｝\n" +
                "     ／プ￣￣`y'¨Y´￣￣ヽ─}j=く\n" +
                "    ノ /レ'>ー{___ｭ`ーー'  ﾘ,ｲ}\n" +
                "   / _勺 ｲ;；∵r===､､∴'∵;  シ \n" +
                "  ,/ └'ノ ＼  ご`    ノ{ー—､__\n" +
                "  人＿_/ー┬ー个-､＿＿,,.. ‐´ 〃`ァーｧー＼\n" +
                ". /  |／ |::::|､      〃 /:::/   ヽ\n" +
                "/    |  |::::|＼､_________／ /:::/〃    |\n");

        long before = System.currentTimeMillis(); // 10:46:30.111

        System.out.println("3초 안에 fawedwer 를 입력하세요.");
        String result = scan.nextLine();

        long after = System.currentTimeMillis();  // 10:46:34.234

        long diff = after - before;

        if(result.equals("fawedwer")){
            if(diff < 3000){
                System.out.println("성공");
            }else{
                System.out.println("실패");
            }
        }else{
            System.out.println("틀리게 입력함");
        }




    }
}
