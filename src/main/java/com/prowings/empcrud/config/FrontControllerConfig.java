package com.prowings.empcrud.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;


public class FrontControllerConfig extends AbstractAnnotationConfigDispatcherServletInitializer{

	@Override
	protected Class<?>[] getRootConfigClasses() {
		
		return new Class[] { SpringMvcConfig.class };
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected String[] getServletMappings() {
		String[] mapping= {"/"};
		return mapping;
	}

}
