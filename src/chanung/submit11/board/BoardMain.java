package chanung.submit11.board;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class BoardMain {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        ArrayList<Board> boardList = new ArrayList<>();

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");

        while(true){
            System.out.println("행동을 선택해주세요");
            System.out.println("1. 글 목록 | 2. 글 쓰기 | 3. 종료");
            System.out.print(">>> ");

            int command = Integer.parseInt(scan.nextLine());

            if(command == 1){
                for(int i = 0; i < boardList.size(); i++){
                    System.out.println(boardList.get(i));
                }
            }else if(command == 2){
                System.out.print("글 제목 입력: ");
                String title = scan.nextLine();

                System.out.print("글 내용 입력: ");
                String content = scan.nextLine();

                Board board = new Board(boardList.size()+1, title, sdf.format(new Date()), content);
                boardList.add(board);
            }else {
                break;
            }


        }



    }
}
