import java.util.ArrayList;

class J {
    public static void main(String[] args) {
        Car car = new Car();

        CarRental cr = new CarRental();

        cr.addCar(car);
        Car x = cr.getCar();

        // ------------------------------

        Scooter scooter = new Scooter();

        ScooterRental sr = new ScooterRental();

        sr.addScooter(scooter);

        Scooter y = sr.getScooter();

        // ------------------------------------

        TV tv = new TV();

        TVRental tr = new TVRental();

        tr.addTV(tv);

        TV z = tr.getTV();
    }    
}

class TV {

}

class TVRental {
    ArrayList<TV> tvs = new ArrayList<TV>();

    void addTV(TV tv) {
        tvs.add(tv);
    }

    TV getTV() {
        return tvs.remove(0);
    }
}

class Scooter {

}

class ScooterRental {
    ArrayList<Scooter> scooters = new ArrayList<Scooter>();

    void addScooter(Scooter scooter) {
        scooters.add(scooter);
    }

    Scooter getScooter() {
        return scooters.remove(0);
    }
}


class Car {

}

class CarRental {
    ArrayList<Car> cars = new ArrayList<Car>();

    void addCar(Car car) {
        cars.add(car);
    }

    Car getCar() {
        return cars.remove(0);
    } 
}