package com.restaurant.service.restaurantservice;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;

public class ApplicationConfig{

    @Bean
    public ModelMapper modelMapper(){
        return new ModelMapper();
    }
}