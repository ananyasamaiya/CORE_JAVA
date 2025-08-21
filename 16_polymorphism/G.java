class G{
    public static void main(String[] args){
        Vehicle a = new SportsCar();

        if(a instanceof Bus){
            System.out.println("SportsCar IS-A Bus");
        }
        else{
            System.out.println("SportsCar IS-not-A Bus");
        }

        if(a instanceof Object){
            System.out.println("SportsCar IS-A Object");
        }
        else{
            System.out.println("SportsCar IS-not-A Object");
        }

        if(a instanceof Vehicle){
            System.out.println("SportsCar IS-A Vehicle");
        }
        else{
            System.out.println("SportsCar IS-not-A Vehicle");
        }

        if(a instanceof FourWheeler){
            System.out.println("SportsCar IS-A FourWheeler");
        }
        else{
            System.out.println("SportsCar IS-not-A FourWheeler");
        }

        if(a instanceof Car){
            System.out.println("SportsCar IS-A Car");
        }
        else{
            System.out.println("SportsCar IS-not-A Car");
        }
        
        if(a instanceof SportsCar){
            System.out.println("SportsCar IS-A SportsCar");
        }
        else{
            System.out.println("SportsCar IS-not-A SportsCar");
        }

    }
}