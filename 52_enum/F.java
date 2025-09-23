enum Days{
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY;
}

class F{
    Days x;
    public static void main(String[] args){
        System.out.println(x);
    } 
}

// F.java:8: error: non-static variable x cannot be referenced from a static context
//         System.out.println(x);
//                            ^
// 1 error