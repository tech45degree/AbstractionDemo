public class Car extends Vehicle implements VehicleStuff,Noise{

    private String color;
    @Override
    public void start() {
        System.out.println("Car start by key");
    }

    @Override
    public void repaint(String updatedColor) {
        this.color = updatedColor;
        System.out.println("Car repaint to "+ this.color);
    }

    @Override
    public void makeNoise() {
        System.out.println("Car make noise vrooom!");
    }

    public  void setWeight(String updatedWeight){
        this.weight = updatedWeight;
      System.out.println("Weight of car is "+this.weight);
    };

}
