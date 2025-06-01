//instance context(obj. ref . var.) -> class member(static)
class J{
    static int y = 222;
    public static void main(String[] args)
    {
        J a = new J();

        System.out.println(a.y);


    }
}