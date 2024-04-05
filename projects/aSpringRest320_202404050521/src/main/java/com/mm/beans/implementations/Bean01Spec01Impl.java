package com.mm.beans.implementations;

import org.springframework.stereotype.Component;

@Component
public class Bean01Spec01Impl implements com.mm.beans.specifications.Bean01Spec {

	@Override
	public String getNome() {
		return "My name is Bean01Spec01Impl ...";
	}

}
