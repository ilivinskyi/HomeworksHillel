package com.ilivinskyi;

import com.ilivinskyi.models.Animal;
import com.ilivinskyi.petshelterdata.PetShelterMessages;

import java.util.List;
import java.util.Scanner;

public class PetShelter {

    Scanner scanner = new Scanner(System.in);

    public void addPet(List<Animal> animals) {
        System.out.print(PetShelterMessages.PAT_NAME_INPUT_MESSAGE.message);
        String name = scanner.nextLine();
        System.out.print(PetShelterMessages.PAT_BREED_INPUT_MESSAGE.message);
        String breed = scanner.nextLine();
        System.out.print(PetShelterMessages.PAT_AGE_INPUT_MESSAGE.message);
        int age = scanner.nextInt();
        scanner.nextLine();

        Animal animal = new Animal(name, breed, age);
        animals.add(animal);
        System.out.println(PetShelterMessages.PET_ADDED_MESSAGE.message);
    }

    public void showAllPets(List<Animal> animals) {
        if (animals.isEmpty()) {
            System.out.println(PetShelterMessages.NO_PETS_MESSAGE.message);
        } else {
            for (int i = 0; i < animals.size(); i++) {
                System.out.println((i + 1) + ". " + animals.get(i));
            }
        }
    }

    public void takePetFromShelter(List<Animal> animals) {
        if (animals.isEmpty()) {
            System.out.println(PetShelterMessages.SHELTER_EMPTY_MESSAGE.message);
            return;
        }

        showAllPets(animals);
        System.out.print(PetShelterMessages.TAKE_PET_MESSAGE.message);
        int index = scanner.nextInt() - 1;
        scanner.nextLine();
        if (index >= 0 && index < animals.size()) {
            Animal removedAnimal = animals.remove(index);
            System.out.println(PetShelterMessages.TAKEN_MESSAGE.message + removedAnimal);
        } else {
            System.out.println(PetShelterMessages.NUMBER_NOT_FOUND_ERROR.message);
        }
    }

    public void printMenu() {
        System.out.println(PetShelterMessages.GREETINGS.message);
        System.out.println(PetShelterMessages.OPTION_ONE.message);
        System.out.println(PetShelterMessages.OPTION_TWO.message);
        System.out.println(PetShelterMessages.OPTION_THREE.message);
        System.out.println(PetShelterMessages.OPTION_FOUR.message);
        System.out.println(PetShelterMessages.CHOOSE_OPTION.message);
    }

    public int readMenuNumberInput() {
        var input = scanner.nextInt();
        scanner.nextLine();
        return input;
    }
}
