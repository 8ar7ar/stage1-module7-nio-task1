package com.epam.mjc.nio;

import java.io.*;


public class FileReader {

    public Profile getDataFromFile(File file) {

        String name;
        int age;
        String email;
        long phone;

        try (java.io.FileReader fileReader = new java.io.FileReader(file)){
            BufferedReader reader = new BufferedReader(fileReader);
            name = reader.readLine().split(": ")[1];
            age = Integer.parseInt(reader.readLine().split(": ")[1]);
            email = reader.readLine().split(": ")[1];
            phone = Long.parseLong(reader.readLine().split(": ")[1]);
        } catch (IOException e) {
            throw new UnableToReadUserDataException("Unable to read User data....", e);
        }

        return new Profile(name, age, email, phone);
    }


}
