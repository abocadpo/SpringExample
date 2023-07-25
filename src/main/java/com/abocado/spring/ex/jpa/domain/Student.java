package com.abocado.spring.ex.jpa.domain;

import java.util.Date;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class Student {
	
	// id, 이름, 전화번호, 이메일, 장래희망
	
	private int id;
	private String name;
	private String phoneNumber;
	private String email;
	private String dreamJob;
	private Date createdAt;
	private Date updatedAt;
	
	
}
