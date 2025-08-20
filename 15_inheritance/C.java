// a class inherited only from his immediate parent(but the parent have inherited from Object)
//treats its as it own so it inherited Object method from immediate parent

class X1{
    void pro(){
        System.out.println("hello");
    }
}

class C extends X1{
    public static void main(String[] args){
        C a = new C();

        a.pro();

        System.out.println(a.toString());
        System.out.println(a.hashCode());
    }
}