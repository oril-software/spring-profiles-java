package com.example.profiles.config;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Profile("prod")
@Component
public class ProdConfig implements Config {

	@Override
	public void setup() {
		//setup some configuration here
		System.out.println("Production configuration setup");
	}
}
