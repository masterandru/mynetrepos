package lesson01;

/**
 * user
 * 03.09.2016
 */
public class SimpleCar extends AbstractCar {
    @Override
    public double getEgineVolume() {
        return 1.7;
    }

    @Override
    public void getDiscription() {
        super.getDiscription();
        System.out.println("Semething custom");
    }
}

