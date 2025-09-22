interface W3{
    void ccc();
}

class I{
    //anonymous inner class
    W3 x = new W3(){
        public void ccc(){

        }
    };
}