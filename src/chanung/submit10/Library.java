package chanung.submit10;

import java.util.ArrayList;

public class Library {
    private ArrayList<Book> bookList = new ArrayList<>();

    private Library(){
        String strBooks = "삼국지, 해리포터와 마법사의 돌, 해리포터와 비밀의 방 , 해리포터와 아즈카반의 죄수,해리포터와 불사조 기사단, 해리포터와 혼혈왕자, 해리포터와 죽음의 성물,어린왕자, 나의 라임 오렌지나무, 이것이 자바다, 좋은생각, 반지의 제왕: 반지 원정대, 반지의 제왕: 두 개의 탑, 반지의 제왕: 왕의 귀환, 토익보카, 개미";
        String[] strArray = strBooks.split(",");
        for(int i = 0; i < strArray.length; i++){
            strArray[i] = strArray[i].trim();
            System.out.println(strArray[i]);
        }

        // strArray : 책 제목
        for(int i = 0; i < strArray.length; i++){
            bookList.add(new Book(bookList.size()+1, strArray[i], false));
        }

        for(int i = 0; i < bookList.size(); i++){
            System.out.println(bookList.get(i));
        }
    }

    private static Library instance = new Library();

    public static Library getInstance(){
        return instance;
    }

    // 책 목록 출력 메소드
    public void printBook(){
        for(Book bo : bookList){
            System.out.println(bo);
        }
    }

    // 책 대여 메소드
    public void borrow(int no){
        // bookList에 담긴 Book 객체 중에 필드변수 no 값이
        // 파라미터로 들어온 no값과 같은 녀석을 찾고,
        // 해당 Book 객체의 isBorrow 값을 true로 바꾼다.
        for(Book bo : bookList){
            if(bo.getNo() == no){
                bo.setBorrow(true);
                System.out.println(bo.getTitle() + "을 대여하였습니다.");
                return;
            }
        }

        System.out.println("해당 책이 존재하지 않습니다.");
    }

    // 책 반납 메소드
    public void returnBook(int no){
        for(Book bo : bookList){
            if(bo.getNo() == no){
                bo.setBorrow(false);
                System.out.println(bo.getTitle() + "가 입고되었습니다.");
                return;
            }
        }
    }

    // 책 검색 메소드
    public void searchBook(String keyword){
        // bookList를 순회하면서 각각의 Book 객체의 title에
        // keyword가 포함되어있으면 출력
        for(Book book : bookList){
            if(book.getTitle().indexOf(keyword) != -1){
                System.out.println(book);
            }
        }

    }


}
