package com.example;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class CalculatorServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int a = Integer.parseInt(request.getParameter("a"));
        int b = Integer.parseInt(request.getParameter("b"));
        int sum = a + b;

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<h2>Result: " + a + " + " + b + " = " + sum + "</h2>");
    }
}
