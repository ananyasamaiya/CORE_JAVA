class U {

}

enum Days extends U {
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY;
}


// U.java:5: error: '{' expected
// enum Days extends U {
//          ^
// U.java:5: error: enum constant expected here
// enum Days extends U {
//           ^
// U.java:6: error: <identifier> expected
//     SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY;
//           ^
// U.java:7: error: reached end of file while parsing
// }
//  ^
// 4 errors