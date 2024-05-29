package com.ilivinskyi;

import com.ilivinskyi.filemanager.PetShelterFileManager;
import com.ilivinskyi.models.Animal;
import com.ilivinskyi.petshelterdata.PetShelterMessages;

import java.util.List;

public class PetShelterApp {

    public static void main(String[] args) {
        PetShelterFileManager fileManager = new PetShelterFileManager();
        PetShelter petShelter = new PetShelter();
        List<Animal> animals = fileManager.loadAnimals();

        while (true) {
            petShelter.printMenu();

            switch (petShelter.readMenuNumberInput()) {
                case 1:
                    petShelter.addPet(animals);
                    break;
                case 2:
                    petShelter.showAllPets(animals);
                    break;
                case 3:
                    petShelter.takePetFromShelter(animals);
                    break;
                case 4:
                    fileManager.saveAnimals(animals);
                    System.out.println(PetShelterMessages.GOODBYE.message);
                    return;
                default:
                    System.out.println(PetShelterMessages.INVALID_OPTION.message);
            }
        }
    }
}
