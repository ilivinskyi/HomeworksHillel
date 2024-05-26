package com.ilivinskyi;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import main.java.models.Animal;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PetShelterApp {
    private static final String FILE_PATH = "animals.json";
    private static List<Animal> animalList = new ArrayList<>();
    private static final ObjectMapper objectMapper = new ObjectMapper();

    public static void main(String[] args) {
        loadAnimals();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Add pet");
            System.out.println("2. Show all");
            System.out.println("3. Take pet from shelter");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    addPet(scanner);
                    break;
                case 2:
                    showAllPets();
                    break;
                case 3:
                    takePetFromShelter(scanner);
                    break;
                case 4:
                    saveAnimals();
                    System.out.println("Goodbye!");
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }

    private static void loadAnimals() {
        File file = new File(FILE_PATH);
        if (file.exists()) {
            try {
                animalList = objectMapper.readValue(file, new TypeReference<List<Animal>>() {});
            } catch (IOException e) {
                System.out.println("Error loading animals: " + e.getMessage());
            }
        }
    }

    private static void saveAnimals() {
        try {
            objectMapper.writeValue(new File(FILE_PATH), animalList);
        } catch (IOException e) {
            System.out.println("Error saving animals: " + e.getMessage());
        }
    }

    private static void addPet(Scanner scanner) {
        System.out.print("Enter pet name: ");
        String name = scanner.nextLine();
        System.out.print("Enter pet breed: ");
        String breed = scanner.nextLine();
        System.out.print("Enter pet age: ");
        int age = scanner.nextInt();
        scanner.nextLine(); // consume newline

        Animal animal = new Animal(name, breed, age);
        animalList.add(animal);
        System.out.println("Pet added successfully.");
    }

    private static void showAllPets() {
        if (animalList.isEmpty()) {
            System.out.println("No pets in the shelter.");
        } else {
            for (int i = 0; i < animalList.size(); i++) {
                System.out.println((i + 1) + ". " + animalList.get(i));
            }
        }
    }

    private static void takePetFromShelter(Scanner scanner) {
        if (animalList.isEmpty()) {
            System.out.println("No pets in the shelter.");
            return;
        }

        showAllPets();
        System.out.print("Enter the number of the pet to remove: ");
        int index = scanner.nextInt() - 1;
        scanner.nextLine(); // consume newline

        if (index >= 0 && index < animalList.size()) {
            Animal removedAnimal = animalList.remove(index);
            System.out.println("Removed: " + removedAnimal);
        } else {
            System.out.println("Invalid number. Please try again.");
        }
    }
}
