package chanung.submit05;

public class Submit05 {

    public static void main(String[] args) {
        makeTree(5);
        makeTree(7);

        System.out.println("\n==================\n");

        String reverse = reverseStr("내일부터 연휴");
        System.out.println(reverse);

        System.out.println("\n=================\n");

        String myBinary = makeBinary(9);
        System.out.println(myBinary); // 10111

        System.out.println(Integer.toBinaryString(9));

        System.out.println("\n===================\n");

        makeTriangle(5);
        makeTriangle(7);

    }

    public static void makeTriangle(int floor){
        //    *
        //   * *
        //  *   *
        // *******
        // i=0, blank=3, star=1
        // i=1, blank=2, star=1, blank=1, star=1
        // i=2, blank=1, star=1, blank=3, star=1
        // i=3, blank=0, star=7

        //     *
        //    * *
        //   *   *
        //  *     *
        // *********
        // i=0, blank=4, star=1
        // i=1, blank=3, star=1, blank=1, star=1
        // i=2, blank=2, star=1, blank=3, star=1
        // i=3, blank=1, star=1, blank=5, star=1
        // i=4, blank=0, star=9

        //      *
        //     * *
        //    *   *
        //   *     *
        //  *       *
        // ***********
        // i=0, blank=5, star=1
        // i=1, blank=4, star=1, blank=1, star=1
        // i=2, blank=3, star=1, blank=3, star=1
        // i=3, blank=2, star=1, blank=5, star=1
        // i=4, blank=1, star=1, blank=7, star=1
        // i=5, blank=0, star=11

        for(int i = 0; i < floor; i++){
            String leftBlank = "";
            for(int k = 0; k < floor-1-i; k++){
                leftBlank += " ";
            }

            if(i == 0){
                // 맨 위층
                System.out.println(leftBlank + "*");
            }else if(i == floor-1){
                // 맨 밑에층
                String star = "";
                for(int s = 0; s < (floor*2)-1; s++){
                    star += "*";
                }
                System.out.println(star);
            }else{
                // 중간층
                String innerBlank = "";
                for(int b = 0; b < (i*2)-1; b++){
                    innerBlank += " ";
                }
                System.out.println(leftBlank + "*" + innerBlank + "*");
            }

        }

    }


    public static String makeBinary(int num){
        String result = "";

        while(true){
            result += num % 2;

            if(num == 1){
                break;
            }
            num /= 2;
        }

        return reverseStr(result);
    }


    public static String reverseStr(String word){
        String reverse = "";
        for(int i = word.length(); i > 0; i--){ // i는 10~1
            reverse += word.substring(i-1, i);
        }
        return reverse;
    }

    public static void makeTree(int floor){
        // 적절한 위치에 파라미터값 배치
        for(int i = 0; i < floor; i++){
            String blank = "";
            for(int k = 0; k < floor-1-i; k++){
                blank += " ";
            }

            String stars = "";
            for(int k = 0; k < (i*2)+1; k++){
                stars += "*";
            }

            System.out.println(blank + stars);
        }
    }



}
