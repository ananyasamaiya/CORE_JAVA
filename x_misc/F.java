class Bhalu{

}

class F{
    public static void main(String[] args){
        Bhalu b = new Bhalu();
        Class k1 = b.getClass();

        F f = new F();
        Class k2 = f.getClass();

        System.out.println(k1);
        System.out.println(k2);
    } 
}