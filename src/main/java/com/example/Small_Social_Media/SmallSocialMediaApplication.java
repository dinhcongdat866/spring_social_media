package com.example.Small_Social_Media;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class },
scanBasePackages={"com.example.Small_Social_Media.repository"})
public class SmallSocialMediaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SmallSocialMediaApplication.class, args);
	}

}
