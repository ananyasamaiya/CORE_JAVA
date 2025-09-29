import java.util.Locale;

class C{
    public static void main(String[] args){
        Locale x1 = new Locale("fr","FR");
        Locale x2 = new Locale("de","DE");
        Locale x3 = new Locale("zh","CN");
        Locale x4 = new Locale("hi","IN");
        Locale x5 = new Locale("da","DK");

        System.out.println(x1.getDisplayCountry(x2) + " - " + x1.getDisplayLanguage(x2));
        System.out.println(x2.getDisplayCountry(x2) + " - " + x2.getDisplayLanguage(x2));
        System.out.println(x3.getDisplayCountry(x2) + " - " + x3.getDisplayLanguage(x2));
        System.out.println(x4.getDisplayCountry(x2) + " - " + x4.getDisplayLanguage(x2));
    }
}