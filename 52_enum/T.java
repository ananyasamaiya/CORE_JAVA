enum Days {
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY;
}

class T extends Days {
    
}

// T.java:5: error: cannot inherit from final Days
// class T extends Days {
//                 ^
// T.java:5: error: enum types are not extensible
// class T extends Days {
// ^
// 2 errors