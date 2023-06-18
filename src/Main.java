public class Main {
    public static void main(String[] args) {
        Car bmwCar = new Car();
        bmwCar.start();
        bmwCar.repaint("Yellow");
        bmwCar.makeNoise();
        bmwCar.setWeight("600KG");

        Bike hondaBike = new Bike();
        hondaBike.start();
        hondaBike.defaultColor();

    }
}