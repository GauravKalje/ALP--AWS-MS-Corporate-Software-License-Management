package com.psl.alp.LicenseCatalogue.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.psl.alp.LicenseCatalogue.Entity.License;
import com.psl.alp.LicenseCatalogue.Repository.LicenseRepository;

@Service
public class LicenseService {

	@Autowired
	LicenseRepository licenseRepository;
	
	
	public License createLicense(License license) {
		
		licenseRepository.save(license);
		return license;
	}
	
	
	public List<License> getLicense(){
		
		List<License> license = new ArrayList<License>();
		licenseRepository.findAll().forEach(license1->license.add(license1));
		
		return license;
		
	}
	
	public boolean getLicenseById(long licenseId) {
		long getlicenseId;
		List<License> license = new ArrayList<License>();
		licenseRepository.findAll().forEach(license1->license.add(license1));
		
		for(License ls: license) {
			if(ls.getLicenseId()==(licenseId)) {
			
				return true;
			}
		}
		
		return false;
			
	}
	
	
	
	public  void deleteLicense(long licenseId) {
		licenseRepository.deleteById(licenseId);
	}
	
	
	
	public License updateLicense(License license,long licenseId) {
		License getLicense;
		getLicense = licenseRepository.findById(licenseId).get();
		
		getLicense.setName(license.getName());
		getLicense.setDescription(license.getDescription());
		getLicense.setProductId(license.getProductId());
		
		licenseRepository.save(getLicense);
		return getLicense;
	}
	
	
	
}
