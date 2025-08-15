//We can marked public to only that class defination whose name is same as source file name(.java)
public class B{

}
public class N{

}
public class O{

}

// B.java:5: error: class N is public, should be declared in a file named N.java
// public class N{
//        ^
// B.java:8: error: class O is public, should be declared in a file named O.java
// public class O{
//        ^
// 2 errors