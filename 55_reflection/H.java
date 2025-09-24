enum CoffeeMugSize{
    SMALL,MEDIUM, LARGE
}

class H{
    public static void main(String[] args){
        Class<CoffeeMugSize> klass = CoffeeMugSize.class;

        CoffeeMugSize[] arr = klass.getEnumConstants();

        for(CoffeeMugSize next : arr){
            System.out.println(next);
        }
    }
}