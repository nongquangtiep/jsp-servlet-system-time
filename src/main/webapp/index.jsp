<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.Date"%>
<!DOCTYPE html>
<html lang="vi">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Hiển Thị Thời Gian Hệ Thống</title>
</head>
<body style="font-family: 'Segoe UI', Arial, sans-serif; text-align: center; margin-top: 80px; background-color: #f8fafc; color: #1e293b;">
    
    <div style="max-width: 650px; margin: 0 auto; background: white; padding: 40px; border-radius: 12px; box-shadow: 0 4px 15px rgba(0,0,0,0.06);">
        <h2 style="color: #1b2a7a; font-size: 32px; margin-bottom: 12px;">Chào mừng tới lớp học Java Web!</h2>
        <p style="font-size: 16px; color: #64748b; margin-bottom: 30px;">Trang JSP động được xử lý và biên dịch trực tiếp từ máy chủ Tomcat.</p>
        
        <%-- Lấy thời gian hiện tại từ máy chủ --%>
        <%
            Date serverTime = new Date();
        %>
        
        <div style="background-color: #f1f5f9; padding: 20px; border-radius: 8px; margin-bottom: 30px;">
            <p style="margin: 0; font-size: 18px; color: #475569;">
                Thời gian hệ thống hiện tại: <br/>
                <strong style="color: #f15a24; font-size: 22px; display: inline-block; margin-top: 8px;"><%= serverTime %></strong>
            </p>
        </div>
        
        <a href="hello" style="display: inline-block; background-color: #1b2a7a; color: white; padding: 12px 24px; text-decoration: none; border-radius: 6px; font-weight: 600;">Đi tới HelloServlet</a>
    </div>

</body>
</html>