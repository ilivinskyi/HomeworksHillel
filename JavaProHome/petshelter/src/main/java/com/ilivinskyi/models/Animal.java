package com.ilivinskyi.models;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Animal {

    private String name;
    private String breed;
    private int age;

    public Animal() {}

    public Animal(String name, String breed, int age) {
        this.name = name;
        this.breed = breed;
        this.age = age;
    }

    @Override
    public String toString() {
        return (
                "Animal{" + "name='" + name + '\'' + ", breed='" + breed + '\'' + ", age=" + age + '}'
        );
    }
}
