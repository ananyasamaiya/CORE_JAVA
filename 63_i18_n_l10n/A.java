import java.util.Locale;

class A{
    public static void main(String[] args){
        Locale x1 = new Locale("fr","FR");
        Locale x2 = new Locale("de","DE");
        Locale x3 = new Locale("zh","CN");
        Locale x4 = new Locale("hi","IN");

        System.out.println(x1);
        System.out.println(x2);
        System.out.println(x3);
        System.out.println(x4);
    }
}