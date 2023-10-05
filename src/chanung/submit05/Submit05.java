package chanung.submit05;

public class Submit05 {

    public static void main(String[] args) {
        makeTree(5);
        makeTree(7);

    }

    public static void makeTree(int floor){
        // 적절한 위치에 파라미터값 배치
        for(int i = 0; i < 5; i++){
            String blank = "";
            for(int k = 0; k < 4-i; k++){
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
