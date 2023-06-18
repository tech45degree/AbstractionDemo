public class Bike extends Vehicle implements VehicleStuff{
    private String color;

    @Override
    public void start() {
        System.out.println("Bike start by Kick");
    }

    @Override
    public void repaint(String updatedColor) {
        this.color = updatedColor;
        System.out.println("Bike repaint to "+ this.color);
    }

    public void defaultColor(){
        System.out.println("Default color of bike is "+this.defaultColor);
    }

}
