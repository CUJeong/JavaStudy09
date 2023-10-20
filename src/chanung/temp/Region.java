package chanung.temp;

public class Region {
    int no;
    String owner;
    boolean isMine;



    public Region(int no, String owner, boolean isMine) {
        this.no = no;
        this.owner = owner;
        this.isMine = isMine;
    }

    @Override
    public String toString() {
        return "[ " + no + "." + "\t]";
    }
}
