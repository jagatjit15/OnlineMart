package com.openmarket.entities;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@Entity
@EqualsAndHashCode(callSuper=false)
public class AdminDetails extends AbstractUserdata{
	
	
	@SequenceGenerator(name = "admin_sequence_generator", allocationSize = 1, initialValue = 1)
	@Id
	@GeneratedValue(generator = "admin_sequence_generator", strategy = GenerationType.SEQUENCE)
	private Long id;
	
	private final String type = "admin";
	
	@Embedded
	AdminLocation location;

}
