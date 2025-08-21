class Y1{

}

class AA extends Y1{}
class BB extends Y1{}
class CC extends Y1{}

class B{
    public static void main(String[] args){
        Y1 a = new AA();
        Y1 b = new BB();
        Y1 c = new CC();
    }
}