import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;

class A{
    public static void main(String[] args) throws IOException{
        Address addr = new Address();
        addr.city = "Nagpur";
        addr.state = "Maharashtra";
        
        Student student = new Student();
        student.name = "vigyan";
        student.age = 12;
        student.address = addr;

        new ObjectOutputStream(new FileOutputStream("bheem.txt")).writeObject(student);
    }
}

// Exception in thread "main" java.io.NotSerializableException: Address
//         at java.base/java.io.ObjectOutputStream.writeObject0(ObjectOutputStream.java:1197)
//         at java.base/java.io.ObjectOutputStream.defaultWriteFields(ObjectOutputStream.java:1582)
//         at java.base/java.io.ObjectOutputStream.writeSerialData(ObjectOutputStream.java:1539)
//         at java.base/java.io.ObjectOutputStream.writeOrdinaryObject(ObjectOutputStream.java:1448)
//         at java.base/java.io.ObjectOutputStream.writeObject0(ObjectOutputStream.java:1191)
//         at java.base/java.io.ObjectOutputStream.writeObject(ObjectOutputStream.java:354)
//         at A.main(A.java:16)