class E2{
    public static void main(String[] args){
        AAA a = new CCC();

        a.laugh();
        a.talk();
        a.walk();
        a.toString();
    }
}


// E2.java:5: error: cannot find symbol
//         a.laugh();
//          ^
//   symbol:   method laugh()
//   location: variable a of type AAA
// E2.java:6: error: cannot find symbol
//         a.talk();
//          ^
//   symbol:   method talk()
//   location: variable a of type AAA
// 2 errors