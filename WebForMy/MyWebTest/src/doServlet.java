import Util.JDBCUtils;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

@WebServlet("/dept/doServlet")
public class doServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        //如果用户勾选了十天免登录
      //  request.setCharacterEncoding("text/html,charset=utf-8");
        PreparedStatement ps=null;
        ResultSet rs=null;
        Connection conn=null;
       String username =request.getParameter("username");
       String password=request.getParameter("password");
        try {
            conn= JDBCUtils.Init();
            String sql="select username,password from loginer where username=?and password=?";
            ps=conn.prepareStatement(sql);
            ps.setString(1,username);
            ps.setString(2,password);
            rs=ps.executeQuery();
            boolean success=false;
           if(rs.next()){
              success=true;
               if("yes".equals(request.getParameter("sure"))){
                   Cookie cookie=new Cookie("username",request.getParameter("username"));
                   Cookie cookie1=new Cookie("password",request.getParameter("password"));
                   cookie.setMaxAge(60*60*24*10);
                   cookie1.setMaxAge(60*60*24*10);
                   request.getRequestDispatcher("/dept/detail").forward(request,response);
               }
            }
           else{
               response.sendRedirect(request.getContextPath()+"/index.jsp");
           }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
