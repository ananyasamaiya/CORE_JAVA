class X1{
    void pro(){

    }
}

class F extends X1{
    @Deprecated
    @Override
    @SuppressWarnings("removal")
    void pro(){
        Integer x = new Integer(12);
    }
}