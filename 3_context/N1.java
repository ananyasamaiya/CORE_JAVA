//instance context-> instance member
class N1{
    float e=5.5f;
    public static void main(String[] args)
    {
        N1 x = new N1();
        x.pro();
    }
    void pro(){
        System.out.println(e);
    }

}