import java.io.File;

class J2 {
    public static void main(String[] args) {
        File file = new File("E:/movies/dholakpur");

        System.out.println("E:/movies/dholakpur exists?: " + file.exists());
        
        boolean flag = file.mkdir();

        System.out.println("folder dholkapur created? : " + flag);
        System.out.println("~~~~~~~~~~~~~~~~~~");
        System.out.println("E:/movies/dholakpur exists?: " + file.exists());
    }
}
