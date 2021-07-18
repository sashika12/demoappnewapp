package com.example.demo.input;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class UserInputDTO {
	
	private String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	private String email;

}
