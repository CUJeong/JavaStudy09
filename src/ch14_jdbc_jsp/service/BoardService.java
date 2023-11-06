package ch14_jdbc_jsp.service;

import ch14_jdbc_jsp.dao.BoardDAO;
import ch14_jdbc_jsp.dto.BoardDTO;
import ch14_jdbc_jsp.jdbc.ConnectionPool;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;

public class BoardService {

    private BoardService(){}

    private static BoardService instance = new BoardService();

    public static BoardService getInstance(){
        return instance;
    }

    private ConnectionPool cp = ConnectionPool.getInstance();
    private BoardDAO dao = BoardDAO.getInstance();

    // 게시글 목록
    public ArrayList<BoardDTO> getBoardList(){
        Connection conn = cp.getConnection();
        ArrayList<BoardDTO> result = new ArrayList<>();

        try {
            result = dao.getBoardList(conn);
        } catch (SQLException e) {
            e.printStackTrace();
        } finally{
            cp.releaseConnection(conn);
        }

        return result;
    }


    // 글쓰기 (board 객체 내부에는 title, content, id 가 들어가 있어야 한다)
    public void writeBoard(BoardDTO board){
        Connection conn = cp.getConnection();

        try {
            dao.writeBoard(conn, board);
        } catch (SQLException e) {
            e.printStackTrace();
        } finally{
            cp.releaseConnection(conn);
        }

    }

    // 글 보기
    public BoardDTO getBoard(int boNo){
        Connection conn = cp.getConnection();
        BoardDTO result = new BoardDTO();

        try {
            result = dao.getBoard(conn, boNo);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally{
            cp.releaseConnection(conn);
        }

        return result;
    }


    // 글 삭제
    public int deleteBoard(BoardDTO board){
        Connection conn = cp.getConnection();
        int result = 0;

        try {
            result = dao.deleteBoard(conn, board);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally{
            cp.releaseConnection(conn);
        }

        return result;
    }


}
