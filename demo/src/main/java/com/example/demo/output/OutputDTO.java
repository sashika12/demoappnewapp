package com.example.demo.output;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class OutputDTO {
	
	public long getUser_id() {
		return user_id;
	}
	public String getName() {
		return name;
	}
	public String getEmail() {
		return email;
	}
	private final long user_id;
	private final String name;
	private final String email;

}
