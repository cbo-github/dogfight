package fr.cbo.games.dogfight;

public class Dog {

    enum Sex {MALE, FEMALE}

    private int strength;
    private int age;
    private int viciousness;
    private int intelligence;
    private int size;
    private int weight;
    private String name;
    private Sex sex;

    public Dog mate(Dog otherDog ) {
        //TODO take other dog stats and return a new pup
        return null;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getViciousness() {
        return viciousness;
    }

    public void setViciousness(int viciousness) {
        this.viciousness = viciousness;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }
}
