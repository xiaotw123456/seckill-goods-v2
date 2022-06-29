package com.example.seckillgoods.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TomcatConfig {
    @Bean
    public Object setRfc() {
        System.setProperty("tomcat.util.http.parser.HttpParser.requestTargetAllow", "|{}");
        return null;
    }
}
