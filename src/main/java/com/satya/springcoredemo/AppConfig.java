package com.satya.springcoredemo;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//this is a configurayin class

@Configuration // marks a class as a source of bean definitions.
@ComponentScan("com.satya.springcoredemo")
public class AppConfig {

}
