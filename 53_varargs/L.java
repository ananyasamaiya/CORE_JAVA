class L {
    static void pro(Animal... x) {
        System.out.println(x);
        System.out.println(x.length);
    }
    public static void main(String[] args) {
        pro();
    }
}