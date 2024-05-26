package com.ilivinskyi.petshelterdata;

public enum PetShelterMessages {
    GREETINGS("Hi! Welcome to the Pet Shelter."),
    GOODBYE("Goodbye!"),
    LOADING_ANIMALS_ERROR("Error loading animals:"),
    SAVING_ANIMALS_ERROR("Error saving animals:"),
    NUMBER_NOT_FOUND_ERROR("Invalid number. Please try again."),
    PET_ADDED_MESSAGE("Pet added successfully."),
    NO_PETS_MESSAGE("No pets in the shelter."),
    SHELTER_EMPTY_MESSAGE("Shelter is empty, all animals have their new home -=^.^=-"),
    TAKEN_MESSAGE("Adopted: "),

    OPTION_ONE("1. Add pet."),
    OPTION_TWO("2. Show all"),
    OPTION_THREE("3. Take pet from shelter"),
    OPTION_FOUR("4. Exit"),
    CHOOSE_OPTION("Choose an option:"),
    INVALID_OPTION("Invalid option. Please try again."),

    PAT_NAME_INPUT_MESSAGE("Enter pet name: "),
    PAT_BREED_INPUT_MESSAGE("Enter pet breed: "),
    PAT_AGE_INPUT_MESSAGE("Enter pet age: "),
    TAKE_PET_MESSAGE("Enter the number of the pet to adopt: ");

    public final String message;

    PetShelterMessages(String message) {
        this.message = message;
    }
}
