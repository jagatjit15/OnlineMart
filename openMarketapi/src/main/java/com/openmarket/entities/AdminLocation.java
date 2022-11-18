package com.openmarket.entities;


import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AdminLocation {
	
	@NotBlank
	@NotEmpty
	@NotNull
	private String state;
	private final String country = "India";
	
	@NotBlank
	@NotEmpty
	@NotNull
	private String city;
	
	@NotBlank
	@NotEmpty
	@NotNull
	private String district;
	
	@NotBlank
	@NotEmpty
	@NotNull
	private String area;
	
	@Pattern(regexp = "^[1-9]{1}[0-9]{2}\\\\s{0, 1}[0-9]{3}$")
	@NotNull
	private String pin;

}
