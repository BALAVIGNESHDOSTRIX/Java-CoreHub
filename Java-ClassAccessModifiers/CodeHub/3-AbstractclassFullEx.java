abstract class Vehicle{
    public abstract int getWheels();
}

class Bus extends Vehicle{
    public int getWheels(){
        return 6;
    }
}

class Bike extends Vehicle{
    public int getWheels(){
        return 2;
    }
}

class Main{
    public static void main(String[] args) {
        Bus bus = new Bus();
        System.out.println(bus.getWheels());

        Bike bike = new Bike();
        System.out.println(bike.getWheels());
    }
}