package com.app.fullstack.codechallenge.backendservice.utility;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.JsonMappingException;
import org.springframework.core.io.ClassPathResource;

import java.io.IOException;

public class ReadJson {

    public static void main(String[] args) {
        iterateJson();
    }

    public static void iterateJson(){

        try (JsonParser jParser = new JsonFactory()
                .createParser(new ClassPathResource("/Cars.json").getFile());) {
            // JSON array?
            if (jParser.nextToken() == JsonToken.START_ARRAY) {

                while (jParser.nextToken() != JsonToken.END_ARRAY) {

                    // loop until token equal to "}"
                    while (jParser.nextToken() != JsonToken.END_OBJECT) {

                        String fieldname = jParser.getCurrentName();
                        if ("name".equals(fieldname)) {
                            // current token is "name",
                            // move to next, which is "name"'s value
                            jParser.nextToken();
                            System.out.println(jParser.getText());
                        }

                        if ("age".equals(fieldname)) {
                            jParser.nextToken();
                            System.out.println(jParser.getIntValue());
                        }

                        if ("messages".equals(fieldname)) {

                            //jParser.nextToken(); // current token is "[", move next
                            if (jParser.nextToken() == JsonToken.START_ARRAY) {
                                // messages is array, loop until token equal to "]"
                                while (jParser.nextToken() != JsonToken.END_ARRAY) {
                                    System.out.println(jParser.getText());
                                }
                            }

                        }

                    }

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
