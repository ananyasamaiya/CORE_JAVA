class D{
    public static void main(String[] args){
        StringBuffer x = new StringBuffer("jay");

        x.append(" kumar");

        System.out.println(x);

        //--------------

        String y = "raj";

        String z = y.concat(" kumar");

        System.out.println(y);
        System.out.println(z);
    }
}