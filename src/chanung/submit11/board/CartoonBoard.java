package chanung.submit11.board;

public class CartoonBoard extends Board{
    private String image;

    public CartoonBoard(int no, String title, String date, String content, String image) {
        super(no, title, date, content);
        this.image = image;
    }

    @Override
    public String toString() {
        return "CartoonBoard{" +
                "image='" + image + '\'' +
                "} " + super.toString();
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
