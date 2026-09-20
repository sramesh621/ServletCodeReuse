package com.lalithsoftware.web;

import javax.servlet.http.*;

/**
 * Interface for implementing the code for checking for null HTTP request
 * objects.
 */
public interface HttpServletRequestCheckResult  {
    public void executeCheckResultCode();

    public void setHttpServletRequest(HttpServletRequest newHttpServletRequest);

    public void setHttpServletResponse(HttpServletResponse newHttpServletResponse);
}
