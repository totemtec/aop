package sample.spring.chapter11.bankapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude= {DataSourceAutoConfiguration.class})
public class BankApp {
	public static void main(String[] args) {
		SpringApplication.run(BankApp.class, args);
	}
}
