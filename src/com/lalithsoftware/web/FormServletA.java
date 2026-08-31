package com.lalithsoftware.web;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSsevletResponse;

public class FormServletA extends HttpServlet
{

    HttpServletRequestCheckerFormA formARequestChecker = null;
  
    public class FormServletA()
    {
        formARequestChecker = new HttpServetRequestCheckerFormA();
    }

    public void doGet(HttpServletRequest request,
                      HttpServletResponse response)
    {
        HttpServletRequestCheckResult servletRequestCheckResult =
            formARequestChecker.checkHTTPRequest(request);
    }
}
