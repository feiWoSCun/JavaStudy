/*
package IOStream;

import JDBC.JDBCS;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class IdentifySadLOCkTest01 {
    public static void main(String[] args) {
        Connection conn=null;
        Statement stmt=null;
       // ResultSet rs=null;
        try {
            conn= JDBCS.Init();
            conn.setAutoCommit(false);
            stmt=conn.createStatement();
            String sql="update employee set number=5 where name='沈应鹏'";
           int count =stmt.executeUpdate(sql);
            conn.commit();
            System.out.println(count);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        finally{
            if(conn!=null){
                try {
                    conn.rollback();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
            JDBCS.close(conn,stmt );

        }
    }
}
*/
