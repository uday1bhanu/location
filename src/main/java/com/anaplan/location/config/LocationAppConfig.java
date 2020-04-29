package com.uday.location.config;

import com.uday.location.filter.ResponseHeadersFilter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LocationAppConfig {

    @Bean
    public ResponseHeadersFilter responseHeadersFilter(){
        return new ResponseHeadersFilter();
    }

}