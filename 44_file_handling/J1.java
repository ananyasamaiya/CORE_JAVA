import java.io.File;

class J1 {
    public static void main(String[] args) {
        File file = new File("C:/windows/dholakpur");

        System.out.println("C:/windows/dholakpur exists?: " + file.exists());
        
        boolean flag = file.mkdir();

        System.out.println("folder dholkapur created? : " + flag);
        System.out.println("~~~~~~~~~~~~~~~~~~");
        System.out.println("C:/windows/dholakpur exists?: " + file.exists());
    }
}