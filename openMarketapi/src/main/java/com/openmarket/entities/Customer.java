package com.openmarket.entities;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.validation.constraints.Email;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@EqualsAndHashCode(callSuper = false)
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Customer{
	
	@SequenceGenerator(name = "admin_sequence_generator", allocationSize = 1, initialValue = 100)
	@Id
	@GeneratedValue(generator = "admin_sequence_generator", strategy = GenerationType.SEQUENCE)
	private Long id;
	private final String type = "user";
	private String firstName;
	private String lastName;
	private LocalDate date_of_birth;
	private String city;
	private String country;
	private String state;
	private String landMark;
	private String pinCode;
	@Email(message = "Please Enter a valid email")
	private String email;
	private String password;
	private String mobile;


}
