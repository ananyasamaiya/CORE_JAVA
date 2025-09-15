import java.io.Serializable;
class Employee implements Serializable{
    String name;
    float rating;
    int salary;

    public String toString(){
        return name + " - " + rating + " - " +  salary;
    }
}