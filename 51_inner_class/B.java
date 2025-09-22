class A{
    ABCD pro(){
        class ABCD{
            ABCD(){
                System.out.println("HI");
            }
        }

        ABCD x = new ABCD();
        return x;
    }
    
}

// F:\Java\examples\51_inner_class>javac B.java
// B.java:2: error: cannot find symbol
//     ABCD pro(){
//     ^
//   symbol:   class ABCD
//   location: class A
// 1 error