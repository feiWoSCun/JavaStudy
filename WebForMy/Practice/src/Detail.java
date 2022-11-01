import Util.Dept;
import Util.JDBCUtils;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/dept/Detail")
public class Detail extends HttpServlet {

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
List<Dept> depts=new ArrayList<>();
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            conn = JDBCUtils.Init();
            String sql = "select number,name,location from department";
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();

            while(rs.next()) {
                String number = rs.getString("number");
                String name = rs.getString("name");
                String location = rs.getString("location");
                Dept dept = new Dept(number, name, location);
                depts.add(dept);
            }
            request.setAttribute("depts",depts);
            request.getRequestDispatcher(request.getContextPath()+"Detail.jsp").forward(request,response);
            } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
            finally {

                JDBCUtils.close(conn,ps,rs);
            }
        }
    }
