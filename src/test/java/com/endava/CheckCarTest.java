package com.endava;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jdk8.Jdk8Module;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import com.fasterxml.jackson.module.paramnames.ParameterNamesModule;
import com.mapping.Car;

import java.time.LocalDateTime;


public class CheckCarTest {
    public static void main(String arg[]) throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper()
                .registerModule(new ParameterNamesModule())
                .registerModule(new Jdk8Module())
                .registerModule(new JavaTimeModule()); // new mod
        LocalDateTime formatter = LocalDateTime.now();

        formatter.toString();
        Car car = new Car("mercedes", 5, formatter);


        //map json to car
        try {

            System.out.println(car);

            String carJson = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(car);
            System.out.println(carJson);
        } catch (JsonParseException e) {
            e.printStackTrace();
        }


    }

}

