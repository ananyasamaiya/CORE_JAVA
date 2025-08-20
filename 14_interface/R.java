interface Intelligent{

}

interface Smart{

}

interface Entrepreneur{

}
class Human{

}

class American implements Intelligent, Smart, Entrepreneur extends Human{

}

// F:\Java\examples\14_interface>javac R.java
// R.java:16: error: '{' expected
// class American implements Intelligent, Smart, Entrepreneur extends Human{
//                                                           ^
// 1 error