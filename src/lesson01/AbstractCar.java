package lesson01;

/**
 * user
 * 02.09.2016
 */
public abstract class AbstractCar implements Car {
    protected int speed = 100;

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }

    public void getDiscription() {
        System.out.println("\n"+this.getClass().getSimpleName()+ "(Speed:" + speed +" "+"EgineVolume:" +getEgineVolume() +")");
    }


}
