package com.example.demo.filters;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.constants.ZuulConstants;
import com.netflix.zuul.exception.ZuulException;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class MyPostFilter extends ZuulFilter {

	@Override
	public boolean shouldFilter() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Object run() throws ZuulException {
		// TODO Auto-generated method stub
		log.info("======POST FILTER CALLED======");
		return null;
	}

	@Override
	public String filterType() {
		// TODO Auto-generated method stub
		return ZuulConstants.ZUUL_FILTER_POST_PATH;
	}

	@Override
	public int filterOrder() {
		// TODO Auto-generated method stub
		return 1;
	}

}
