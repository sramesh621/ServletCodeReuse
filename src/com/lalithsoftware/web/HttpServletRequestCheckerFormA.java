package com.lalithsoftware.web;

public class HttpServletRequestCheckerFormA implements HttpServletRequestCheck  {

    private HttpServletRequestCheckResult[] decisionList = null;

    public HttpServletRequestCheckerFormA()  {
        decisionList = new HttpServletRequestCheckResult[2];
    }

    public HttpServletRequestCheckResult checkHttpServlet(HttpServletRequest httpServletRequest)  {
        int checkResult = 0;


        return decisionList[checkResult];
    }
}
