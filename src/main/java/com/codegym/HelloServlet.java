package com.codegym;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(name = "HelloServlet", urlPatterns = {"/hello"})
public class HelloServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        
        response.setContentType("text/html;charset=UTF-8");
        
        try (PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html lang='vi'>");
            out.println("<head>");
            out.println("    <meta charset='UTF-8'>");
            out.println("    <title>Hello Servlet</title>");
            out.println("</head>");
            out.println("<body style='font-family: Arial, sans-serif; text-align: center; margin-top: 80px; background-color: #f8fafc;'>");
            out.println("    <div style='max-width: 600px; margin: 0 auto; background: white; padding: 35px; border-radius: 12px; box-shadow: 0 4px 12px rgba(0,0,0,0.06);'>");
            out.println("        <h1 style='color: #1b2a7a;'>Chào mừng bạn đến với Servlet đầu tiên!</h1>");
            out.println("        <p style='color: #475569; font-size: 16px;'>Thời gian phản hồi từ Servlet: <strong>" + new Date() + "</strong></p>");
            out.println("        <p style='color: #f15a24; font-size: 16px;'>Ứng dụng Java Web đang chạy tương thích chuẩn Jakarta EE 10</p>");
            out.println("        <br/>");
            out.println("        <a href='index.jsp' style='color: #0284c7; text-decoration: none; font-weight: bold;'>&larr; Quay lại trang chủ JSP</a>");
            out.println("    </div>");
            out.println("</body>");
            out.println("</html>");
        }
    }
}