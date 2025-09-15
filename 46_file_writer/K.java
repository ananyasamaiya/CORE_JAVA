import java.io.PrintWriter;
import java.io.FileNotFoundException;

class K {
    public static void main(String[] args) throws FileNotFoundException {
        PrintWriter pw = new PrintWriter("ajay.txt");

        String name = "Gopal";
        int age = 23;
        float marks = 78.45f;

        PrintWriter cw = pw.printf("My Name: %s and My Age: %d and My Marks: %.2f", name, age, marks);

        System.out.println(pw == cw);

        pw.close();
    }
}