class E1{
    public static void main(String[] args){
        BBB a = new CCC();

        a.laugh();
        a.talk();
        a.walk();
        a.toString();
    }
}

// E1.java:5: error: cannot find symbol
//         a.laugh();
//          ^
//   symbol:   method laugh()
//   location: variable a of type BBB
// 1 error