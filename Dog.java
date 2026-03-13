public class Dog extends Animal {
    private String breed;

    public Dog(String animalName, String ownerName, int age, String breed) {
        super(animalName, ownerName, age);
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String toString() {
        return getAnimalName() + " " + getOwnerName() + " " + getAge() + " Dog " + breed;
    }

    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Dog)) return false;

        Dog d = (Dog) obj;

        return getAnimalName().equals(d.getAnimalName()) &&
               getOwnerName().equals(d.getOwnerName()) &&
               getAge() == d.getAge() &&
               breed.equals(d.breed);
    }
}