package com.lalithsoftware.web;

/**
 * Branch logic for null HTTP request objects.
 */
public class HttpServletRequestCheckNullResult
        implements HttpServletRequestCheckResult  {
    public void executeCheckResultCode()  {
          System.err.println("The HttpServletRequest was null.");
    }
}
