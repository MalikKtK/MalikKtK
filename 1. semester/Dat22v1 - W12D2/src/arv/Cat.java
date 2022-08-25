package arv;

public class Cat extends Animal {
    //  private String name; DO NOT TYPE
    private String catnip;
    private String typeOfCatFood;

    Cat(String name) {
        setName(name);
        System.out.println("Constructing Cat: " + name);
    }
}
