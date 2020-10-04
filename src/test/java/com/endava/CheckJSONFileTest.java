package com.endava;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jdk8.Jdk8Module;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import com.fasterxml.jackson.module.paramnames.ParameterNamesModule;
import com.mapping.Car;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.time.LocalDateTime;

public class CheckJSONFileTest {

    @Test
    public void checkFile() throws IOException {
        ObjectMapper mapper = new ObjectMapper()
                .registerModule(new ParameterNamesModule())
                .registerModule(new Jdk8Module())
                .registerModule(new JavaTimeModule()); // new mod
        LocalDateTime formatter = LocalDateTime.now();

        formatter.toString();
        Reader reader = new FileReader("src\\test\\resources\\testData\\car.json");
        Car car = mapper.readValue(reader, Car.class);
        System.out.println(car);
        Assertions.assertEquals("mercedes",car.getBrand());
    }
}
