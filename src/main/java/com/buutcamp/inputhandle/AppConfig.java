package com.buutcamp.inputhandle;

import com.buutcamp.inputhandle.main.Viro;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

       @Bean
    public Finland getFinland() {
        return new Finland();
    }
    @Bean
    public Viro getviro() {
        return new Viro();
    }


}
