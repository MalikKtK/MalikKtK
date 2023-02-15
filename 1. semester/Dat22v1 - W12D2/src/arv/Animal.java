package arv;

public class Animal {
    private String name;
    private String breed;
    private double weight;

    Animal() {
        System.out.println("Constructing Animal");
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
