package ch16_network.open_api;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class MedicineDAO {

    private MedicineDAO(){}

    private static MedicineDAO instance = new MedicineDAO();

    public static MedicineDAO getInstance(){
        return instance;
    }

    // 약 데이터 추가(INSERT)
    public int insertMedicine(Connection conn, MedicineDTO medicine) throws SQLException {
        StringBuffer query = new StringBuffer();
        query.append("INSERT INTO medicines (    ");
        query.append("     entpName             ");
        query.append("   , itemName             ");
        query.append("   , efcyQesitm           ");
        query.append(") VALUES (                ");
        query.append("     ?                    ");
        query.append("   , ?                    ");
        query.append("   , ?                    ");
        query.append(")                         ");

        PreparedStatement ps = conn.prepareStatement(query.toString());

        int idx = 1;
        ps.setString(idx++, medicine.getEntpName());
        ps.setString(idx++, medicine.getItemName());
        ps.setString(idx++, medicine.getEfcyQesitm());

        int result = ps.executeUpdate();

        ps.close();

        return result;
    }

    // 증상에 따른 약 조회
    public ArrayList<MedicineDTO> searchMedicine(Connection conn, String keyword) throws SQLException {
        StringBuffer query = new StringBuffer();
        query.append("SELECT                    ");
        query.append("     entpName             ");
        query.append("   , itemName             ");
        query.append("   , efcyQesitm           ");
        query.append("FROM                      ");
        query.append("     medicines            ");
        query.append("WHERE 1=1                 ");
        query.append("  AND efcyQesitm LIKE '%' || ? || '%'  ");

        PreparedStatement ps = conn.prepareStatement(query.toString());

        ps.setString(1, keyword);

        ResultSet rs = ps.executeQuery();

        ArrayList<MedicineDTO> result = new ArrayList<>();

        while(rs.next()){
            MedicineDTO medicine = new MedicineDTO();

            medicine.setEntpName(rs.getString("entpName"));
            medicine.setItemName(rs.getString("itemName"));
            medicine.setEfcyQesitm(rs.getString("efcyQesitm"));

            result.add(medicine);
        }

        rs.close();
        ps.close();

        return result;
    }


}
