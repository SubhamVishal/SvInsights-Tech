package com.insightssv.tech;

import com.insightssv.tech.utils.TestUtils;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class InsightssvServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(InsightssvServiceApplication.class, args);
		TestUtils.printVersion();
	}

}
