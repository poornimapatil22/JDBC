package com.xworkz.Servlet;


import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.Dto.SignInDto;
import com.xworkz.Service.SignInServiceImpl;


@WebServlet(loadOnStartup = 1, urlPatterns = "/signUp")
    public class SignInServlet extends HttpServlet{

        public SignInServlet() {
            System.out.println("Servlet class");
        }

        @Override
        protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

            String userName = req.getParameter("userName");
            String email = req.getParameter("email");

            SignInDto signInDto = new SignInDto(userName, email);

            SignInServiceImpl signaWebServiceImpl = new SignInServiceImpl();
            signaWebServiceImpl.save(signInDto);

            RequestDispatcher dispatcher = req.getRequestDispatcher("index.jsp");
            dispatcher.forward(req, resp);
        }

    }

