package com.totemtec.start;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.lang.annotation.Target;

@SpringBootApplication
public class App {
	public static void main(String[] args) {
		SpringApplication.run(App.class, args);

//		run();
	}


	private static void run()
	{
		ApplicationContext context = new AnnotationConfigApplicationContext(ConcertConfig.class);
		Performance pi = (Performance) context.getBean(Performance.class);
		((Jump) pi).duJump();
		pi.perform();
	}
}
