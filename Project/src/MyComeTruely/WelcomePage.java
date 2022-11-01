package MyComeTruely;
import MyComeTruely.JDBCS;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class WelcomePage extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PreparedStatement ps = null;
        Connection conn = null;
        ResultSet rs = null;
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html,charset=utf-8");
        PrintWriter out = response.getWriter();
        try {
            conn = MyComeTruely.JDBCS.Init();
            String sql = "select number,name,location from department";
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();



out.print("            <!DOCTYPE html>");
out.print("  <html>");
out.print("	<head>");
out.print("		<meta charset='utf-8'>");
out.print("		<title>操作页</title>");
out.print("	</head>");
out.print("	<body>");
out.print("		<table border='1px' align='center' >");
out.print("			<tr>");
out.print("				<th>部门编号</th>");
out.print("				<th>部门名称</th>");
out.print("				<th>部门位置</th>");
out.print("				<th>操作</th>");
out.print("			</tr>");

            while (rs.next()) {
                String number = rs.getString("number");
                String name = rs.getString("name");
                String location = rs.getString("location");
           out.print("    	<tr>");
		out.print("	<td>"+number+"</td>");
		out.print("	<td>"+name+"</td>");
		out.print("	<td>"+location+"</td>");
		out.print("	<td>");
		out.print("		<a href=''>删除</a>");
		out.print("		<a href=''>修改</a>");
		out.print("		<a href=''>详情</a>");
		out.print("	</td>");
		out.print("</tr>");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        finally {
            MyComeTruely.JDBCS.close(conn,ps,rs);
        }
    }
}
