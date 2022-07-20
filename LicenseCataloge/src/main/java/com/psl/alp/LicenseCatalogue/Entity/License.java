package com.psl.alp.LicenseCatalogue.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.GenericGenerator;

import lombok.Data;

@Entity
@Data
@Table(name = "license")
public class License {


	@Id
    @GeneratedValue
	private long licenseId;
	
	@Column(name = "name")
	@NotNull
	@NotBlank
	private String name;
	
	@Column(name = "description")
	@NotNull
	@NotBlank
	private String description;
	
	@Column(name = "productId")
	@NotNull
	@NotBlank
	private String productId;
	
	
	
	public License() {
		super();
	}

	public License(long licenseId, String name, String description,String productId) {
		super();
		this.licenseId = licenseId;
		this.name=name;
		this.description=description;
		this.productId=productId;
	}

	public long getLicenseId() {
		return licenseId;
	}

	public void setLicenseId(long licenseId) {
		this.licenseId = licenseId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}
	
	
	
}
