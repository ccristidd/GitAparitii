package com.example.numaraparitii;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class NumarAparitiiApplication {

    @Bean
    public static NumarAparitiiCifra numarAparitiiBean() {
        return new NumarAparitiiCifra();
    }

    public static void main(String[] args) {
        SpringApplication.run(NumarAparitiiApplication.class, args);
       String a = numarAparitiiBean().numarAparitiiCalculat(0,20,9);
        System.out.println(a);
    }
}
