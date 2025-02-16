/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import za.ac.tut.model.SumCalculator;

/**
 *
 * @author Gift Mashiya
 */
public class SumCalculatorServlet extends HttpServlet {

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
      
        
        int param1 = Integer.parseInt(request.getParameter("param1"));
        int param2 = Integer.parseInt(request.getParameter("param2"));
        
        
        SumCalculator sumC = new SumCalculator(param1, param2);
        int result = sumC.calculateSum();
        
        request.setAttribute("param1", param1);
        request.setAttribute("param2", param2);
        request.setAttribute("result", result);
        
        RequestDispatcher disp =request.getRequestDispatcher("index.jsp");
        disp.forward(request , response);
    }

}