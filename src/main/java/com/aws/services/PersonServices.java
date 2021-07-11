package com.aws.services;

import com.aws.respository.PersonRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;

import java.util.function.Supplier;


public class PersonServices  {
    @Autowired
    private PersonRespository personRespository;


    @Bean
    public Supplier<String> test2(){
        return ()-> "Hello World!!TEST";
    }


}
