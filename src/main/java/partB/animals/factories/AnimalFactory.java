package partB.animals.factories;


import partB.animals.Cat;
import partB.animals.storage.CatHouse;
import partB.animals.storage.DogHouse;
import partB.animals.Dog;

import java.util.Date;

public class AnimalFactory {
    public static Dog createDog(String name, Date birthDate) {
        Integer newId = DogHouse.getNumberOfDogs();
        return new Dog(name, birthDate, newId);
    }

    public static Cat createCat(String name, Date birthDate) {
        Integer newId = CatHouse.getNumberOfCats();
        return new Cat(name, birthDate, newId);
    }
}
