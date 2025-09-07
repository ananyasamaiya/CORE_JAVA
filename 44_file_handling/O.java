import java.io.File;

class O{
    public static void main(String[] args){
        File file = new File("demo");

        File dest = new File("ghtotkachha");

        file.renameTo(dest);
    }
}