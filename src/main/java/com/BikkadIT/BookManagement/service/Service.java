package com.BikkadIT.BookManagement.service;

import java.util.Base64;
import java.util.Base64.Encoder;

public class Service {

	public String saveuser(String user) {

		Encoder encoder = Base64.getEncoder();
		byte[] bytes = user.getBytes();

		byte[] encode = encoder.encode(bytes);
		String newencode = encode.toString();
		return newencode;

	}

	public static void main(String[] args) {

		Service u1 = new Service();
		String saveuser = u1.saveuser("Hello");
		System.out.println(saveuser);
	}
}