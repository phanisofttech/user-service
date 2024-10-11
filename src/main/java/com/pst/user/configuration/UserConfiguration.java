package com.pst.user.configuration;

import org.springframework.context.annotation.Bean;

import org.springframework.context.annotation.Configuration;

import com.pst.user.response.UserResponse;

@Configuration
public class UserConfiguration {
   
	@Bean
	 UserResponse userResponse() {
		return new UserResponse();
	}
}
