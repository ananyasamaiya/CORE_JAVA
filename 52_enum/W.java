interface AA1 {
    int y = 78;
}

enum AA2 implements AA1 {

}

class W {
    public static void main(String[] args) {
        System.out.println(AA2.y);
    }
}