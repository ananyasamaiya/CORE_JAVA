class H{
    public static void main(String[] args){
        Car a = new SportsCar();

        if(a instanceof Bus){
            System.out.println("SportsCar IS-A Bus");
        }
        else{
            System.out.println("SportsCar IS-not-A Bus");
        }
    }
}

// H.java:5: error: incompatible types: Car cannot be converted to Bus
//         if(a instanceof Bus){
//            ^
// 1 error