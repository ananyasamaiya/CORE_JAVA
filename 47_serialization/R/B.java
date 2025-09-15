import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.IOException;

class B{
    public static void main(String[] args) throws IOException,ClassNotFoundException{
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("bheem.txt"));

        Student s1 = (Student)ois.readObject();
        System.out.println(s1.name);

        Student s2 = (Student)ois.readObject();
        System.out.println(s2);

        ois.close();
    
    }
}

// sugyan
// Exception in thread "main" java.io.EOFException
//         at java.base/java.io.ObjectInputStream$BlockDataInputStream.peekByte(ObjectInputStream.java:3225)
//         at java.base/java.io.ObjectInputStream.readObject0(ObjectInputStream.java:1695)
//         at java.base/java.io.ObjectInputStream.readObject(ObjectInputStream.java:514)
//         at java.base/java.io.ObjectInputStream.readObject(ObjectInputStream.java:472)
//         at B.main(B.java:12)