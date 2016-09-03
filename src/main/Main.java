package main;

public class Main {

    public static void main(String[] args) {
        System.out.println("--- START PROGRAMM ---");
        System.out.println("Hello World!");
        System.out.format("Hello World - %s !\n", args[0]);

        Car raceCar = new RaceCar(); // Car эт оинтерфейс н осоздават ьнужн оконкретный класс
        Car simpleCar = new SimpleCar();
        raceCar.getDiscription();
        //simpleCar.setSpeed(200);
        simpleCar.getDiscription();


    }
}
