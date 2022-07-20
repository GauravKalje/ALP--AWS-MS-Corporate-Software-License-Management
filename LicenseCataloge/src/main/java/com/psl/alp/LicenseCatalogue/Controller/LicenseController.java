package com.psl.alp.LicenseCatalogue.Controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.psl.alp.LicenseCatalogue.Entity.License;
import com.psl.alp.LicenseCatalogue.Service.LicenseService;

@RestController
@RequestMapping("/api/v1")
public class LicenseController {

	@Autowired
	LicenseService licenseService;
	
	
	@PostMapping("/licenses")
    public License createLicense(@RequestBody @Valid License license) {
		
		return licenseService.createLicense(license);
	}
    
    
    
	@GetMapping("/licenses")
    public List<License> getLicense(){
    	return licenseService.getLicense();
    }
    
	@GetMapping("/licenses/{licenseId}")
    public boolean validateLicenseId(@PathVariable long licenseId) {
    	 return licenseService.getLicenseById(licenseId);
    }
   
	@DeleteMapping("/licenses/{licenseId}")
    public void deleteLiscense(@PathVariable("licenseId") long licenseId) {
    	licenseService.deleteLicense(licenseId);
    }
    
	@PutMapping("/licenses/{licenseId}")
    public License updateLicense(@RequestBody @Valid License license,@PathVariable("licenseId") long licenseId) {
    	 return licenseService.updateLicense(license,licenseId);
    }
   
}
