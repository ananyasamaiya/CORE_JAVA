@FunctionalInterface
interface G3 {
    void pro();
}

// class G2 implements G1 {
//     public void pro() {
//         System.out.println("Hello");
//     }
// }

class H {
    public static void main(String[] args) {
        G3 x = new G3(){
            public void pro(){
                System.out.println("Hi");
            }
        };


        x.pro();
    }
}