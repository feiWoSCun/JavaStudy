/*package IOStream;

import JDBC.JDBCS;

import java.sql.*;

public class IdentifySadLock {
    public static void main(String[] args) {

        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        Statement stmt=null;
        try {
            conn = JDBCS.Init();
            conn.setAutoCommit(false);
            String sql = "select * from employee where name=? for update";
            ps=conn.prepareStatement(sql);
            ps.setString(1, "沈应鹏");
            rs = ps.executeQuery();
            conn.commit();
            String sq="select * from employee where name ='沈应鹏'";
            stmt=conn.createStatement();

            stmt.executeQuery(sq);

            while(rs.next()){
                System.out.println(rs.getString("number"));
            }
        } catch (SQLException e) {
            if(conn!=null){
                try {
                    conn.rollback();
                } catch (SQLException ex) {
                    throw new RuntimeException(ex);
                }

            }
            throw new RuntimeException(e);
        } finally {

            JDBCS.close(conn, ps, rs);

        }
    }
}*/
