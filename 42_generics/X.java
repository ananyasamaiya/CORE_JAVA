import java.util.ArrayList;

class X {
    public static void main(String[] args) {
        // ArrayList<Number> x = new ArrayList<Integer>();    // NOT OK   

        ArrayList<? extends Number> x1 = new ArrayList<Byte>();    // OK   
        ArrayList<? extends Number> x2 = new ArrayList<Short>();    // OK   
        ArrayList<? extends Number> x3 = new ArrayList<Integer>();    // OK   
        ArrayList<? extends Number> x4 = new ArrayList<Long>();    // OK   
        ArrayList<? extends Number> x5 = new ArrayList<Float>();    // OK   
        ArrayList<? extends Number> x6 = new ArrayList<Double>();    // OK   
        ArrayList<? extends Number> x7 = new ArrayList<Number>();    // OK   
    }    
}