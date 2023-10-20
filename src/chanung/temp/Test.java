package chanung.temp;

public class Test {
    public static void main(String[] args) {

        String inputCal = "13+23*45-11";

        String[] array = inputCal.split("[+*-/]");

        for(int i = 0; i < array.length; i++){
            System.out.println(array[i]); // 13, 23, 45, 11
        }

    }
}
