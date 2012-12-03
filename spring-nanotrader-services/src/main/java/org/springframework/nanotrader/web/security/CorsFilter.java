package org.springframework.nanotrader.web.security;

import java.io.IOException;
import java.util.Enumeration;

import org.springframework.web.filter.OncePerRequestFilter;

public class CorsFilter extends OncePerRequestFilter {

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
            throws ServletException, IOException {
    	
//        if (request.getHeader("Access-Control-Request-Method") != null && "OPTIONS".equals(request.getMethod())) {
//            // CORS "pre-flight" request
//            response.addHeader("Access-Control-Allow-Origin", "*");
//            response.addHeader("Access-Control-Allow-Methods", "GET, POST, PUT, DELETE");
//            response.addHeader("Access-Control-Allow-Headers", "Content-Type");
//            response.addHeader("Access-Control-Max-Age", "1800");
//        }
//        else
//        {
    	
    	Enumeration e = request.getHeaderNames();
    	String headers;
    	 while (e.hasMoreElements()) {
    	      headers = (String) e.nextElement();
    	      if (headers != null) {
    	        System.out.println("Header: " + headers + " : "+ request.getHeader(headers));
    	      }
    	    }
    	
            response.addHeader("Access-Control-Allow-Origin", "*");
            response.addHeader("Access-Control-Allow-Methods", "GET, POST, PUT, DELETE, OPTIONS");
            response.addHeader("Access-Control-Allow-Headers", "Content-Type, API_TOKEN");
            response.addHeader("Access-Control-Max-Age", "1800");
//        }
        filterChain.doFilter(request, response);
    }


}
