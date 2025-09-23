enum Days{
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY;
}

class F1{
    static Days x = SUNDAY;
    public static void main(String[] args){
        System.out.println(x);
    } 
}

// G.java:6: error: cannot find symbol
//     static Days x = SUNDAY;
//                     ^
//   symbol:   variable SUNDAY
//   location: class F1
// 1 error