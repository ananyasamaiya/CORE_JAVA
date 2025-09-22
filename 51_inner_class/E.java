class E{
    int g = 11;

    static void pqr(){
        class RTY{
            void pro(){
                System.out.println(g);
            }
        }
        RTY e = new RTY();
        e.pro();
    }
    public static void main(String[] args){
        E.pqr();
    }
}

// E.java:7: error: non-static variable g cannot be referenced from a static context
//                 System.out.println(g);
//                                    ^
// 1 error