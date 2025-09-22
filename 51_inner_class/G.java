interface W1{
    void aaa();
}

class A100 implements W1{
    public void aaa(){
        System.out.println("Hi");
    }
}

class G{
    public static void main(String[] args){
        W1 x = new A100();
        x.aaa();
    }
}


