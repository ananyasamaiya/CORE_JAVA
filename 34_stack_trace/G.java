class X1{
    X1(){
        int y = 12/0;
    }
}

class X2 extends X1{ }
class X3 extends X2{ }

class G extends X3{
    public static void main(String[] args){
        G z = new G();
    }
}