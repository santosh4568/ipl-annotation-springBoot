package com.ipl_spring_annotation;

import org.springframework.beans.BeansException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.ipl_spring_annotation")
public class IplSpringAnnotationApplication {

	public static void main(String[] args) {
		try (AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(IplSpringAnnotationApplication.class)) {
			iplService ipService = (iplService) context.getBean("iplService");
			ipService.runMenu();
		} catch (BeansException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
//		SpringApplication.run(IplSpringAnnotationApplication.class, args);
	}

}
