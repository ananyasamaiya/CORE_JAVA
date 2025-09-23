enum CCC{
    A,B,C;

    class Y{
        void pro(){
            System.out.println("Hiiiiiii");
        }
    }

    static class X{

    }
}

class Z{
    public static void main(String[] args){
        CCC.Y x = CCC.A.new Y();

        x.pro();
    }
}