package com.app.fullstack.codechallenge.backendservice.utility;

import com.app.fullstack.codechallenge.backendservice.model.Car;
import com.app.fullstack.codechallenge.backendservice.repository.CarRepositoryImpl;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.JsonMappingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;

import java.io.IOException;

public class ReadJson {

    @Autowired
    private CarRepositoryImpl carRepositoryImpl;
    public void iterateJson(){

        try (JsonParser jParser = new JsonFactory()
                .createParser(new ClassPathResource("/Cars.json").getFile());) {
            // JSON array?
            if (jParser.nextToken() == JsonToken.START_ARRAY) {

                while (jParser.nextToken() != JsonToken.END_ARRAY) {

                    carRepositoryImpl.insertWithQuery(jParser.readValueAs(Car.class));
                }
            }

        } catch (JsonGenerationException e) {
            e.printStackTrace();
        } catch (JsonMappingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
