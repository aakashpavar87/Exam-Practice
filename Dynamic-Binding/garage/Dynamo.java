
abstract class Car{
    public String name;
    public int maxSpeed;
    public int airBags;

    abstract public void get_car();
}
class Sports_car extends Car{
    public int seats;
    public Sports_car(String n, int speed, int airbag, int seats) {
        super.name = n;
        super.maxSpeed = speed;
        super.airBags = airbag;
        this.seats = seats;
    }

    public void get_car() {
        String intro = "Name : " + this.name + "\n" + "Max Speed : " + this.maxSpeed + "\n" + "Air Bags : " + this.airBags + "\n" + "Seats : " + this.seats + "\n";

        System.out.println(intro);
    }
}

public class Dynamo {
    public static void main(String[] args) {
        Car myCar = new Sports_car("Supra", 270, 4, 2);
        myCar.get_car();
    }
}
