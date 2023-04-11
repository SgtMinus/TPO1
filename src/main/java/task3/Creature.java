package task3;

public class Creature {
    private String name;
    private int age;
    private String gender;
    private String species;


    public Creature(String name, int age, String species) {
        this.name = name;
        this.age = age;
        this.species = species;
        this.gender = "Apache";
    }

    public Creature(String name, int age, String gender, String species) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.species = species;
    }

    public String doHeroicDeeds(String action) {
        return(name + " is doing something heroic: " + action);
    }


    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String getSpecies() {
        return species;
    }
}