//can't add anything
import java.util.ArrayList;
import java.util.List;

class H {
    public static void main(String[] args) {
        ArrayList<?> x1 = new ArrayList<Cat>();
        ArrayList<?> x2 = new ArrayList<Cow>();
        ArrayList<?> x3 = new ArrayList<Dog>();
        ArrayList<?> x4 = new ArrayList<Animal>();
        ArrayList<?> x5 = new ArrayList<Object>();
        ArrayList<?> x6 = new ArrayList<Student>();
        ArrayList<?> x7 = new ArrayList<String>();
        ArrayList<?> x8 = new ArrayList<List>();
        // x4.add(new Animal());  // NOT OK
        // x4.add(new Dog());  // NOT OK
    }
}