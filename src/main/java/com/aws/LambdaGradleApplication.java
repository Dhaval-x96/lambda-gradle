package com.aws;

import com.aws.entity.Person;
import com.aws.json.PersonDetails;
import com.aws.respository.PersonRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;

@SpringBootApplication
public class LambdaGradleApplication {

    @Autowired
    private PersonRespository personRespository;

    public static void main(String[] args) {
        SpringApplication.run(LambdaGradleApplication.class, args);
    }

    @Bean
    public Supplier<List<Person>> getAll(){
        return ()->this.personRespository.findAll();
    }
    @Bean
    public Supplier<String> test(){
        return ()-> "Hello World!!TEST";
    }

    @Bean
    public Function<Person, Person> save(){
        return (input)-> this.personRespository.save(input);
    }
}