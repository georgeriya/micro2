package com.example.demo.filters;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class MyPreFilter extends ZuulFilter {

	@Override
	public boolean shouldFilter() {
		// TODO Auto-generated method stub
		return RequestContext.getCurrentContext().getRequest().getRequestURI().contains("/get"); //all requests starting with get should b filtered
//		Principal p = RequestContext.getCurrentContext().getRequest().getUserPrincipal().getName().equals("USER");
	}
	
	@Autowired
	private HttpServletResponse resp;

	@Override
	public Object run() throws ZuulException {
		// TODO Auto-generated method stub
		log.info("===========PRE-FILTER CALLED===========");
		
		boolean result = RequestContext.getCurrentContext().getRequest().getMethod().equalsIgnoreCase("POST");
		
		if(result) {
			
			try {
				RequestContext.getCurrentContext().getRequest().authenticate(resp);
				
			}
			catch (IOException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			catch (ServletException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
		
		return null;
	}

	@Override
	public String filterType() {
		// TODO Auto-generated method stub
		return "pre";
	}

	@Override
	public int filterOrder() {
		// TODO Auto-generated method stub
		return 1;
	}

}
