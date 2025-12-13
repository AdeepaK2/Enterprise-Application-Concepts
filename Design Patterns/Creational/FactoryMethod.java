public class FactoryMethod{

    public static void main(String[] args) {
        VehicleFactory carFactory = new CarFactory();
        carFactory.deliver("Car");
        
        VehicleFactory vanFactory = new VanFactory();
        vanFactory.deliver("Van");
    }

}
interface Vehicle {
    void start();
}


class Car implements Vehicle {
    @Override
    public void start() {
        System.out.println("Car started");
    }
}

class Van implements Vehicle {
    @Override
    public void start() {
        System.out.println("Van started");
    }
}


abstract class VehicleFactory {
    public abstract Vehicle createVehicle();

    public void deliver(String type) {
        Vehicle vehicle = createVehicle();
        vehicle.start();
        System.out.println(type + " is being delivered");
    }
}


class CarFactory extends VehicleFactory {
    @Override
    public Vehicle createVehicle() {
        return new Car();
    }
}

class VanFactory extends VehicleFactory {
    @Override
    public Vehicle createVehicle() {
        return new Van();
    }
}