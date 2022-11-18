package com.openmarket.entities;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@EqualsAndHashCode(callSuper = false)
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class CustomerDetails extends AbstractUserdata{
	
	@SequenceGenerator(name = "admin_sequence_generator", allocationSize = 1, initialValue = 1)
	@Id
	@GeneratedValue(generator = "admin_sequence_generator", strategy = GenerationType.SEQUENCE)
	private Long id;
	
	private final String type = "user";
	
	@Embedded
	CustomerAddress address;

}
