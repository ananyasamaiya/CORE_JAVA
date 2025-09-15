import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.IOException;
import java.util.ArrayList;

class B{
    public static void main(String[] args) throws IOException,ClassNotFoundException{
        ArrayList<Student> al = (ArrayList<Student>)(new ObjectInputStream(new FileInputStream("arjun.txt")).readObject());

        for(Student x : al){
            System.out.println(x.name);
            System.out.println(x.age);
            System.out.println(x.address.city.cityName);
            System.out.println(x.address.state.stateName);
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        }
        
    }
}