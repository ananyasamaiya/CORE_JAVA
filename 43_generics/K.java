import java.util.ArrayList;

class K {
    public static void main(String[] args) {
        Car car = new Car();

        Rental<Car> cr = new Rental<Car>();

        cr.addItem(car);
        Car x = cr.getItem();

        // ------------------------------

        Scooter scooter = new Scooter();

        Rental<Scooter> sr = new Rental<Scooter>();

        sr.addItem(scooter);

        Scooter y = sr.getItem();

        // ------------------------------------

        TV tv = new TV();

        Rental<TV> tr = new Rental<TV>();

        tr.addItem(tv);

        TV z = tr.getItem();

        // cr.addItem(car);
        // Scooter t = cr.getItem();

        // tr.addItem(car);
        // Car u = tr.getItem();
    }  

    class Rental<Z>{
        ArrayList<Z> items = new ArrayList<Z>();

        void addItem(Z z){
            items.add(z);
        }

        Z getItem(){
            return items.remove(0);
        }
    } 
}
class TV {

}

class Scooter {

}

class Car {

}