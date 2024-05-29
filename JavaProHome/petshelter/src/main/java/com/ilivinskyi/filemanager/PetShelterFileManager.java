package com.ilivinskyi.filemanager;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.ilivinskyi.models.Animal;
import com.ilivinskyi.petshelterdata.PetShelterMessages;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class PetShelterFileManager {

    private final String FILE_PATH = "animals.json";
    private final ObjectMapper objectMapper = new ObjectMapper();

    public List<Animal> loadAnimals() {
        File file = new File(FILE_PATH);
        List<Animal> list = new ArrayList<>();
        try {
            if (!file.createNewFile()) {
                list = this.objectMapper.readValue(file, new TypeReference<>() {});
            }
            return list;
        } catch (IOException e) {
            System.out.println(PetShelterMessages.LOADING_ANIMALS_ERROR.message + e.getMessage());
        }
        return list;
    }

    public void saveAnimals(List<Animal> animals) {
        try {
            objectMapper.writeValue(new File(FILE_PATH), animals);
        } catch (IOException e) {
            System.out.println(PetShelterMessages.SAVING_ANIMALS_ERROR.message + e.getMessage());
        }
    }
}
