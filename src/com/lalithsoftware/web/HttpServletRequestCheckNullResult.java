package com.lalithsoftware.web;

public class HttpServletRequestCheckNullResult implements HttpServletRequestCheckResult  {
    public void executeCheckResultCode()  {
          System.err.println("The HttpServletRequest was null.");
    }
}
