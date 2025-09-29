import java.util.Locale;

class B{
    public static void main(String[] args){
        Locale x1 = new Locale("fr","FR");
        Locale x2 = new Locale("de","DE");
        Locale x3 = new Locale("zh","CN");
        Locale x4 = new Locale("hi","IN");

        System.out.println(x1.getDisplayCountry() + " - " + x1.getDisplayLanguage());
        System.out.println(x2.getDisplayCountry() + " - " + x2.getDisplayLanguage());
        System.out.println(x3.getDisplayCountry() + " - " + x3.getDisplayLanguage());
        System.out.println(x4.getDisplayCountry() + " - " + x4.getDisplayLanguage());
    }
}