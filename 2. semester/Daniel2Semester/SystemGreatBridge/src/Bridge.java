import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Bridge {
    Map<String, Car> carsDetail;
    Set<String> carsNumberplate;

    public Bridge() {
        this.carsDetail = new HashMap<>();
        this.carsNumberplate = new HashSet<>();
    }

    public void addCar(Car car) {
        carsDetail.put(car.getNumberplate(), car);
        carsNumberplate.add(car.getNumberplate());
    }

    public Car getCar(String numberplate) {
        return carsDetail.get(numberplate);
    }

    public Set getNumberplateSet() {
        return carsNumberplate;
    }
}
