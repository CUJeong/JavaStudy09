package chanung.submit10;

public class Book {
    private int no;             /* 책 번호 */
    private String title;       /* 책 제목 */
    private boolean isBorrow;   /* 대여 여부 */

    public Book() {
    }

    public Book(int no, String title, boolean isBorrow) {
        this.no = no;
        this.title = title;
        this.isBorrow = isBorrow;
    }

    @Override
    public String toString() {

        String state = "[책번호: " + no + ", 책 제목: " + title +
                ", 대여상태: " + "입고중]";
        if(isBorrow){
            state = "[책번호: " + no + ", 책 제목: " + title +
                    ", 대여상태: " + "대여중]";
        }
        return state;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isBorrow() {
        return isBorrow;
    }

    public void setBorrow(boolean borrow) {
        isBorrow = borrow;
    }
}
