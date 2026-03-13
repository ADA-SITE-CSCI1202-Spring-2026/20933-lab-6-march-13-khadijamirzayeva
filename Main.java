public class Main {
    public static void main(String[] args) {

        Animal a1 = new Animal("Cat", "Alice", 3);
        System.out.println(a1);

        Dog d1 = new Dog("Petya", "Mike", 5, "Haski");
        System.out.println(d1);

        Dog d2 = new Dog("Petya", "Mike", 5, "Haski");

        System.out.println(d1.equals(d2));
    }
}