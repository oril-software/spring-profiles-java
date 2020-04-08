package com.example.profiles.config;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Profile("dev")
@Component
public class DevConfig implements Config {

	@Override
	public void setup() {
		//setup some configuration here
		System.out.println("Development configuration setup");
	}
}
