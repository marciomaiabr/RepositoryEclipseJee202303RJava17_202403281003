package com.mm.config;

import jakarta.faces.annotation.FacesConfig;

@FacesConfig
public class FacesConfigurationBean {

	static {
		System.out.println("FacesConfigurationBean.static");
	}

	public FacesConfigurationBean() {
		System.out.println("FacesConfigurationBean.()[" + (this) + "]");
	}

}
