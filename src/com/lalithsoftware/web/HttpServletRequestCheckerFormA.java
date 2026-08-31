package com.lalithsoftware.web;

public class HttpServletRequestCheckerFormA implements HttpServletRequestCheck
{

    private HttpServletRequestCheckResult[] decisionList = null;

    public HttpServletRequestCheckerFormA()  {
        decisionList = new HttpServletRequestCheckResult[32];
        decisionList[0] = new HttpServletRequestCheckNullResult();
        for(int k = 1; k < 32; k++)
        {
            decisionList[k] = new HttpServletRequestCheckNonNullResult();
        }
    }

    public HttpServletRequestCheckResult
    		checkHttpServlet(HttpServletRequest httpServletRequest)  {
        int checkResult = System.inherentHashCode(httpServletRequest);
        int checkResultBitSum = 0;
        int checkResultCopy = checkResult;
        for(int k = 0; k < 32; k++)
        {
            checkResultBitSum += checkResultCopy & 1;
            checkResultCopy >>= 1;
        }
        return decisionList[checkResultBitSum];
    }
}
