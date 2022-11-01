import Util.JDBCUtils;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
@WebServlet("/login")
public class WelcomePage extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Cookie[] cookie=request.getCookies();
        String username = null;
        String password = null;
        if(cookie!=null) {
            for (int i = 0; i < cookie.length; i++) {
                if ("username".equals(cookie[i].getName())) {
                    username = cookie[i].getValue();
                }
                if ("password".equals(cookie[i].getName())) {
                    password = cookie[i].getValue();
                }
            }
        }
        if(username!=null&&password!=null){
            PreparedStatement ps = null;
            ResultSet rs = null;
            Connection conn = null;
            try {
                conn = JDBCUtils.Init();
                String sql = "select username,password from loginer where username=?";
                ps = conn.prepareStatement(sql);
                ps.setString(1, username);
                rs = ps.executeQuery();
                boolean success = false;
                if (rs == null) {
                    response.sendRedirect(request.getContextPath());
                } else {
                    request.getRequestDispatcher( "/index.jsp").forward(request, response);
                }
            } catch (SQLException e) {
                throw new RuntimeException(e);
            } finally {
                JDBCUtils.close(conn, ps, rs);
            }
        }
        else{
            String s=request.getContextPath()+"/index.jsp";
            response.sendRedirect(s);
        }
        }
}
