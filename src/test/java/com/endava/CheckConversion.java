package com.endava;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.mapping.Car;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class CheckConversion {
    public static void main(String args[]) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();

        Reader reader = new FileReader("\\testData\\car.json");
        Car car = objectMapper.readValue(reader, Car.class);
        System.out.println(car);

    }
}
