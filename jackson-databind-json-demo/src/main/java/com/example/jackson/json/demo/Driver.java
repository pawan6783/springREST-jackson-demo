package com.example.jackson.json.demo;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			ObjectMapper mapper = new ObjectMapper();
			Student theStudent = mapper.readValue(new File("data/sample-full.json"), Student.class);
			System.out.println("First Name= "+theStudent.getFirstName());
			System.out.println("Last Name= "+theStudent.getLastName());
			
			Address tempAddress = theStudent.getAddress();
			
			System.out.println("street="+tempAddress.getStreet());
			System.out.println("city="+tempAddress.getCity());
			System.out.println("zip="+tempAddress.getZip());
			System.out.println("country="+tempAddress.getCountry());
			
			for(String it : theStudent.getLanguages()) {
				System.out.println(it);
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
