package com.openmarket.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CustomerAddress {
	
	private final String country= "India";
	private String state;
	private String city;
	private String district;
	private String landMark;
	private String area;
	private String pincode;

}
