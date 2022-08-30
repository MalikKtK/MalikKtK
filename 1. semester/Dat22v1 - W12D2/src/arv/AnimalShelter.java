package arv;

public class AnimalShelter {
    void go() {
        Cat c = new Cat("Figgi");
        System.out.println("Cat name: " + c.getName());

        Dog d = new Dog("Fido");
        System.out.println("Dog name: " + d.getName());
    }

    public static void main(String[] args) {
        new AnimalShelter().go();
    }
}
