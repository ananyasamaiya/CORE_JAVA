interface W4{
    void ddd();
}

class J{
    W4 a = new W4(){
        public void ddd(){

        }
    };

    W4 b = new W4(){
        public void ddd(){

        }
    };
}