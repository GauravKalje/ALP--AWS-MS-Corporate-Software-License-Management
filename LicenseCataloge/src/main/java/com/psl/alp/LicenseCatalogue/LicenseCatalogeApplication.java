package com.psl.alp.LicenseCatalogue;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.psl.alp.LicenseCatalogue.Entity.License;

@SpringBootApplication
@EnableEurekaClient
@EnableJpaRepositories
public class LicenseCatalogeApplication {

	public static void main(String[] args) {
		SpringApplication.run(LicenseCatalogeApplication.class, args);
	}

}
