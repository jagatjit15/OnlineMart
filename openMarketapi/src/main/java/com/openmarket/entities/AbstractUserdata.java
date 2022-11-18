package com.openmarket.entities;

import javax.persistence.MappedSuperclass;
import javax.validation.constraints.Email;
import javax.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@MappedSuperclass
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AbstractUserdata {
	
	
	private String name;
	
	
	@Pattern(regexp = "/^\\+?[1-9][0-9]{7,14}$/")
	private String mobile;
	
	private String gender;
	
	@Pattern(regexp = "^(?=[a-zA-Z0-9._]{8,20}$)(?!.*[_.]{2})[^_.].*[^_.]$")
    private String userName;
    
    @Email
	private String email;
    
    @Pattern(regexp = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&-+=()])(?=\\\\S+$).{8, 20}$")
	private String password;
	

}
