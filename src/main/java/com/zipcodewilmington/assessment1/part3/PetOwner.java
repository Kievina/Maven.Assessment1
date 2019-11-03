package com.zipcodewilmington.assessment1.part3;

import com.zipcodewilmington.assessment1.part2.ArrayUtils;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by leon on 2/16/18.
 */
public class PetOwner {
    /**
     * @param name name of the owner of the Pet
     * @param pets array of Pet object
     */
    public String name;
    public Pet[] pets;

    //ArrayUtils arrayUtils = new ArrayUtils();
    public PetOwner(String name, Pet... pets) {
        this.name = name;
        this.pets = pets;
        if (pets != null) {
            for (int i = 0; i < pets.length; i++) {
                pets[i].setOwner(this);

            }
        }
    }

    /**
     * @param pet pet to be added to the composite collection of Pets
     */
    public void addPet(Pet pet) {
        pet.setOwner(this);
        if (pets == null) {
            pets = new Pet[1];
            pets[0] = pet;
        } else {
            Pet[] petsNew = new Pet[pets.length + 1];
            for (int i = 0; i < pets.length; i++) {
                petsNew[i] = pets[i];

            }
            petsNew[petsNew.length] = pet;
        }
    }

    /**
     * @param pet pet to be removed from the composite collection Pets
     */ //TODO
    public void removePet(Pet pet) {
        ArrayList<Pet> newPetList = new ArrayList<>();
        if (pets != null && pets.length > 1) {
            int sizeOfNewArray = pets.length - 1;
            for (int i = 0; i < pets.length; i++) {
                if (!pets[i].equals(pet))
                    newPetList.add(pets[i]);
            }
            this.pets = newPetList.toArray(new Pet[sizeOfNewArray]);
        } else {
            this.pets = new Pet[1];
        }
    }

    /**
     * @param pet pet to evaluate ownership of
     * @return true if I own this pet
     */
    public Boolean isOwnerOf(Pet pet) {
        return (pet.getOwner() == this);
    }

    /**
     * @return the age of the Pet object whose age field is the lowest amongst all Pets in this class
     */
    public Integer getYoungetPetAge() {
        int minAge = pets[0].getAge();
        for (int i = 1; i < pets.length; i++) {
            if (minAge > pets[i].getAge()) {
                minAge = pets[i].getAge();
            }
        }
        return minAge;
    }


    /**
     * @return the age of the Pet object whose age field is the highest amongst all Pets in this class
     */
    public Integer getOldestPetAge() {
        Integer maxAge = pets[0].getAge();
        for (int i = 1; i < pets.length; i++) {
            if (maxAge < pets[i].getAge()) {
                maxAge = pets[i].getAge();
            }
        }
        return maxAge;
    }


    /**
     * @return the sum of ages of Pet objects stored in this class divided by the number of Pet object
     */
    public Float getAveragePetAge() {
        float sum = 0;
        for (int i = 0; i < pets.length; i++) {
            sum = sum + pets[i].getAge();
        }
        return sum / getNumberOfPets();
    }

    /**
     * @return the number of Pet objects stored in this class
     */
    public Integer getNumberOfPets() {
        return pets.length;
    }

    /**
     * @return the name property of the Pet
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return array representation of animals owned by this PetOwner
     */
    public Pet[] getPets() {
        return this.pets;
    }
}
