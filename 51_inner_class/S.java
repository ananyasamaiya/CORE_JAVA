//access nested class in third class

class R1{
    static class UU1{

    }
}

class S{
    public static void main(String[] args){
        R1.UU1 x = new R1.UU1();
    }
}