package carsWithAnAttitude;

public class CarsWithAnAttitude {
    private String brand;
    private String make;
    private String honk;
    String userInput;
    Boolean isRunning;

    CarsWithAnAttitude(String brand, String make, String honk){

    }

    void setBrand(String b) {
        if (!b.equals(""))
        brand = b;
        else
            brand = "N/A";
    }

    String getBrand() {
        return brand;
    }

    void setMake(String m) {
        if (!m.equals(""))
        make = m;
        else
            make = "N/A";
    }

    String getMake() {
        return make;
    }

    void setHonk(String h) {
        if (!h.equals(""))
        honk = h;
        else
            honk = "N/A";
    }

    String getHonk() {
        return honk;
    }

    }


