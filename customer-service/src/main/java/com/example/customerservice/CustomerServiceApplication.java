package com.example.customerservice;

import com.example.customerservice.entities.Customer;
import com.example.customerservice.repo.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CustomerServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(CustomerServiceApplication.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner(CustomerRepository customerRepository){
        return args -> {
            customerRepository.save(Customer.builder()
                            .name("Youssef")
                            .email("youssef@gmail.com")
                    .build());
            customerRepository.save(Customer.builder()
                    .name("Maryam")
                    .email("mary@gmail.com")
                    .build());
            customerRepository.save(Customer.builder()
                    .name("Ayoub")
                    .email("ayoub@gmail.com")
                    .build());
        };
    }

}
