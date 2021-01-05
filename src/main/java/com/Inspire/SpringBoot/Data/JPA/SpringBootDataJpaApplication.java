package com.Inspire.SpringBoot.Data.JPA;

import com.Inspire.SpringBoot.Data.JPA.Model.Student;
import com.Inspire.SpringBoot.Data.JPA.Repositories.StudentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringBootDataJpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootDataJpaApplication.class, args);
	}


	@Bean
	CommandLineRunner commandLineRunner (StudentRepository studentRepository){
		return args -> {
			Student maria = new Student("Maria","Jones","maria@gmail.com",24 );
			studentRepository.save(maria);

			Student erastus = new Student("Erastus","Doh","erastus.doh@gmail.com",22 );
			studentRepository.save(erastus);
		};
	}

}
