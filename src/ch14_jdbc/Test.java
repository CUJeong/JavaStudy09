package ch14_jdbc;

import java.sql.*;

public class Test {
    public static void main(String[] args) {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            System.out.println("드라이버 등록 성공");
        } catch (ClassNotFoundException e) {
            System.out.println("드라이버 등록 실패");
            throw new RuntimeException(e);
        }

        String url = "jdbc:oracle:thin:@nextit.or.kr:1521:xe";
        String id = "java";
        String pw = "oracle21c";

        try {
            Connection conn = DriverManager.getConnection(url, id, pw);

            System.out.println("연결 성공");

            String query = "SELECT * FROM members";

            PreparedStatement ps = conn.prepareStatement(query);

            ResultSet rs = ps.executeQuery();

            while(rs.next()){
                System.out.println(rs.getString("user_id"));
                System.out.println(rs.getString("user_name"));
            }


        } catch (SQLException e) {

            System.out.println("연결 실패");
            throw new RuntimeException(e);
        }

    }
}
