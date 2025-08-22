/*
here there is no dynamic dispatch

if there is no method overriding
so it is decided by the type of variable

compile see type of variable it is car so car wala will run
*/

class E{
    static void pro(Car car){
        System.out.println("car parameterized method");
    }

    static void pro(SportsCar scar){
        System.out.println("SportsCar parameterized method");
    }

    public static void main(String[] args){
        Car x = new SportsCar();

        pro(x); car parameterized method
    }
}

class Car{

}

class SportsCar extends Car{

}