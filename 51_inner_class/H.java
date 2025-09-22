interface W2{
    void bbb();
}

class H{
    public static void main(String[] args){
        //method anonymous inner class...
        W2 t = new W2(){
            // public void bbb(){
            //     System.out.println("Hello");
            // }
        };
        t.bbb();
        System.out.println(t);
    }
}

//  <anonymous H$1> is not abstract and does not override abstract method bbb() in W2
//         W2 t = new W2(){
//                        ^
// 1 error