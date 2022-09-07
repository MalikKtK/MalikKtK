import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        // bridges
        Bridge bridge_1 = new Bridge();
        Bridge bridge_2 = new Bridge();
        Bridge bridge_3 = new Bridge();

        ArrayList<Bridge> bridges = new ArrayList<>();
        bridges.add(bridge_1);
        bridges.add(bridge_2);
        bridges.add(bridge_3);

        // cars
        Car A = new Car("A", "blue", 11, 2);
        Car B = new Car("B", "blue", 11, 2);
        Car C = new Car("C", "blue", 11, 2);
        Car D = new Car("D", "blue", 11, 2);

        ArrayList<Car> cars = new ArrayList<>();
        cars.add(A);
        cars.add(B);
        cars.add(C);
        cars.add(D);

        // add cars bridges
        bridge_1.addCar(A);
        bridge_2.addCar(A);
        bridge_3.addCar(A);

        bridge_2.addCar(B);
        bridge_3.addCar(B);

        bridge_1.addCar(C);
        bridge_2.addCar(C);

        bridge_1.addCar(D);
        bridge_2.addCar(D);
        bridge_3.addCar(D);

        // find bridge car crossings
        System.out.println();

        Set<String> AllBridges = new HashSet<>();
        // intersection of all
        AllBridges.addAll(bridge_1.getNumberplateSet());
        AllBridges.retainAll(bridge_2.getNumberplateSet());
        AllBridges.retainAll(bridge_3.getNumberplateSet());

        System.out.println(AllBridges);


//        carLoop:
//        for (Car findCar : cars) {
//            String findNumberplate = findCar.getNumberplate();
//
//            for (Bridge bridge : bridges) {
//                if (bridge.getCar(findNumberplate) == null) {
//                    System.out.printf("%s <NOT> FOUND ALL PLACES%n", findNumberplate);
//                    continue carLoop;
//                }
//            }
//
//            System.out.printf("%s FOUND ALL PLACES%n", findNumberplate);
//        }


    }
}
