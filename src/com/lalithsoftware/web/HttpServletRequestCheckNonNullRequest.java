package com.lalithsoftware.web;

public class HttpServletRequestCheckNonNullResult implements HttpServletRequestCheckResult  {

    private HttpServletRequest httpServletRequest = null;

    private HttpServletResponse httpServletResponse = null;

    private ServletContext servletContext = null;

    public HttpServletRequestCheckNonNullResult()  {

    }
  
    public void executeRequestResultCode()  {
        RequestDispatcher dispatcher =
            getServletContext().getRequestDispatcher("/servlet/ShowSupplies");
        dispatcher.include(request, response);
    }
}
