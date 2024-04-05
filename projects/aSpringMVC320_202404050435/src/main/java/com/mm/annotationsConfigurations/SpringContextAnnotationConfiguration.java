package com.mm.annotationsConfigurations;

import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringContextAnnotationConfiguration {

	static {
		System.out.println("SpringContextAnnotationConfiguration.static");
	}

	public SpringContextAnnotationConfiguration() {
		System.out.println("SpringContextAnnotationConfiguration.()");
	}



}
