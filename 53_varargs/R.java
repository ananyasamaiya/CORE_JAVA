class R {
    static void pro(Object... x) {
        for(Object next : x)
            System.out.println(next); 
    }
    public static void main(String[] args) {
        pro(12, "mohan", new Student(), X1.A, new WW(){});
    }    
}

enum X1 {
    A, B
}


class Student {

}

interface WW {

}