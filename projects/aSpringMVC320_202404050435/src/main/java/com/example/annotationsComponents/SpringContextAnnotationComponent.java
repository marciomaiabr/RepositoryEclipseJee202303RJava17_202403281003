package com.example.annotationsComponents;

import org.springframework.stereotype.Component;

@Component
public class SpringContextAnnotationComponent {

	static {
		System.out.println("SpringContextAnnotationComponent.static");
	}

	public SpringContextAnnotationComponent() {
		System.out.println("SpringContextAnnotationComponent.()");
	}



}
