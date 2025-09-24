class B{
    public static void main(String[] args){
        Class x = Class.forName("User");
    }
}

// B.java:3: error: unreported exception ClassNotFoundException; must be caught or declared to be thrown
//         Class x = Class.forName("User");
//                                ^
// 1 error