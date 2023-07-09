package com.example.day3;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet (name = "MappingSpec",urlPatterns = "/serv")
public class MappingSpec extends HttpServlet {

    @Override
    public void init() throws ServletException {

    }
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Do Mapping Spec");

        System.out.println("Context Path"+req.getContextPath());

        System.out.println("Path info"+req.getPathInfo());

        System.out.println("Query String "+req.getQueryString());

        System.out.println("Request URL"+req.getRequestURL());

        System.out.println("Protocol"+req.getProtocol());

        System.out.println("Scheme"+req.getScheme());

        System.out.println("Remote Host"+req.getRemoteHost());



        System.out.println("Remote Access"+req.getRemoteAddr());

        System.out.println("Server Name"+req.getServerName());

        System.out.println("ServerPort"+req.getServerPort());

        System.out.println("Local name"+req.getLocalName());

        System.out.println("Local Port"+req.getLocalPort());

        System.out.println("Local Address"+req.getLocalAddr());

        System.out.println("Get Method"+req.getMethod());

    }


}
