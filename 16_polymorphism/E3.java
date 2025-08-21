class E3{
    public static void main(String[] args){
        Object a = new CCC();

        a.laugh();
        a.talk();
        a.walk();
        a.toString();
    }
}

// E3.java:5: error: cannot find symbol
//         a.laugh();
//          ^
//   symbol:   method laugh()
//   location: variable a of type Object
// E3.java:6: error: cannot find symbol
//         a.talk();
//          ^
//   symbol:   method talk()
//   location: variable a of type Object
// E3.java:7: error: cannot find symbol
//         a.walk();
//          ^
//   symbol:   method walk()
//   location: variable a of type Object
// 3 errors
