package arv;

public class Dog extends Animal{

    Dog(String name) {
        setName(name);
    }

    @Override
    public String getName() {
        return super.getName();
    }
}
