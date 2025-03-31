package org;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.*;

public class Main {
    public static void main(String[] args) throws JsonProcessingException {
        System.out.println(System.getProperty("user.dir"));
        serialize();
    }


    public static void serialize() throws JsonProcessingException {

        final Person person = new Person("Virginia", "Woolf", 173, "Kensigton");
        ObjectMapper mapper = new ObjectMapper();
        String jsonString = mapper.writeValueAsString(person);


        String directory = person.getClass().getAnnotation(MyAnnotation.class).directory();
        String filePath = directory + File.separator + person.getSurname()+person.getName() + ".json";

        try (FileWriter fileWriter = new FileWriter(filePath)) {
            fileWriter.write(jsonString);
            System.out.println("Person object serialized to: " + filePath);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}