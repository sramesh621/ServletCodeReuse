package com.lalithsoftware.web;

public class HttpServletRequestCheckNonNullResult implements HttpServletRequestCheckResult  {

    private HttpServletRequest httpServletRequest = null;

    private HttpServletResponse httpServletResponse = null;

    private ServletContext servletContext = null;

    public HttpServletRequestCheckNonNullResult()  {

    }

    public HttpServletRequest getHttpServletRequest()    {
            return httpServletRequest;
    }

    public void setHttpServletRequest(HttpServletRequest newRequest)    {
            httpServletRequest = newRequest;
    }

    public HttpServletResponse getHttpServletResponse()    {
            return httpServletResponse;
    }

    public void setHttpServletResponse(HttpServletResponse newResponse)    {
            httpServletResponse = newResponse;
    }

    public ServletContext getServletContext()    {
            return servletContext;
    }

    public void setServletContext(ServletContext newServletContext)    {
            servletContext = newServletContext;
    }
    
    public void executeRequestResultCode()  {
        HttpServletRequest httpReqeust = getHttpServletRequest();
        HttpServletResponse httpResponse = getHttpServletResponse();
        ServletContext servletContext = getServletContext();
        RequestDispatcher dispatcher = servletContext.getRequestDispatcher("/servlet/ShowSupplies");
        dispatcher.include(request, response);
    }
}
