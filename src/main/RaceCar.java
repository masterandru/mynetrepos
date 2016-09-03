package main;

/**
 * user
 * 03.09.2016
 */
public class RaceCar extends AbstractCar {

    public RaceCar() {
        speed = 500;
    }


    @Override
    public double getEgineVolume() {
        return 3.5;
    }
}
