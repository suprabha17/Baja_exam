package com.app.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


public class Request {
	//"data": [â€œAâ€�,â€�1â€�,â€�334â€�,â€�4â€�,â€�Râ€�]
	
	private String[]  alphabets;
	

	public Request(String[] alphabets) {
		super();
		this.alphabets = alphabets;
	}

	public String[] getAlphabets() {
		return alphabets;
	}

	public void setAlphabets(String[] alphabets) {
		this.alphabets = alphabets;
	}
	
}
