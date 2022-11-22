package com.openmarket.entities;

import javax.persistence.*;
import javax.validation.constraints.Email;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "SupplierPartner")
public class SupplierPartner{
	
	
	@SequenceGenerator(name = "admin_sequence_generator", allocationSize = 1, initialValue = 100)
	@Id
	@GeneratedValue(generator = "admin_sequence_generator", strategy = GenerationType.SEQUENCE)
	@Column(name = "supplierId")
	private Long supplierId;
	
	private String companyName;

	private String city;

	private String country;

	private String state;

	private String pinCode;

	@Email(message = "Please Enter a valid email")
	private String email;

	private String password;

	private String mobile;

	@Override
	public boolean equals(Object obj){
		SupplierPartner supplier = (SupplierPartner) obj;
		if(supplier.companyName.equalsIgnoreCase(this.companyName) &&
		    supplier.email.equalsIgnoreCase(this.email)
				&& supplier.mobile.equals(this.mobile)){
			return true;
		}

		return false;
	}


	@Override
	public int hashCode() {
		int hash = mobile.hashCode() + email.hashCode() + companyName.hashCode();
		return hash;
	}

}
