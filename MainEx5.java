public class MainEx5 {
    public static void main(String[] args) {

        Account acc = new Account(1, "John", 500);

        acc.deposit(200);

        try {
            acc.withdraw(800);
        } catch (InvalidAmountException e) {
            System.out.println(e.getMessage());
        }

        Dog dog = new Dog("Petya", "Bob", 3, "Labrador");
        System.out.println(dog);
    }
}

