package ch15_inout;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class NotePad {

    public static void main(String[] args) {
        // 프로그램 실행시
        // 파일명과 내용을 입력받아
        // /home/pcxx/stuList 폴더 내에 해당 파일명으로 입력한
        // 내용이 들어간 텍스트 파일 생성하기
        Scanner scan = new Scanner(System.in);

        System.out.print("파일명 입력: ");
        String fileName = scan.nextLine();

        System.out.print("내용 입력: ");
        String content = scan.nextLine();

        try(FileWriter writer = new FileWriter("/home/ssam/stuList/" + fileName + ".txt")){
            writer.write(content);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }

}
