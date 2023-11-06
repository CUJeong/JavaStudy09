package ch15_inout;

import java.io.FileWriter;
import java.io.IOException;

public class FileWrite {

    public static void main(String[] args) {

        try(FileWriter writer = new FileWriter("/home/ssam/stuList/total.txt", true);) {

            String msg = "두번째로 하고싶은말";
            writer.write(msg);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }

}
