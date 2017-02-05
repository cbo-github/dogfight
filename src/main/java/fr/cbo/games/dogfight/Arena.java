package fr.cbo.games.dogfight;

import java.util.Set;

public class Arena {

    private String name;
    private Set<Dog> dogs;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Dog> getDogs() {
        return dogs;
    }

    public void setDogs(Set<Dog> dogs) {
        this.dogs = dogs;
    }

    public Dog fight(){
        //TODO dogs should fight and return winning dog;
        return null;
    }
}
