import java.io.File;

class B1{
    public static void main(String[] args){
        File file = new File("A.java");

        boolean flag = file.exists();

        System.out.println("A.java exists?: " + flag);
    }
}
