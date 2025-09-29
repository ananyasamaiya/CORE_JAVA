class F {
    public static void main(String[] args) {
        StringBuffer x = new StringBuffer("lion");

        StringBuffer y = x;

        x.append("kumar");

        System.out.println(x);
        System.out.println(y);
        System.out.println(x==y);
    }    
}