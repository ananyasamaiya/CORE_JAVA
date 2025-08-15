//conclusion of 11_one_file_one_class  -
//1) there should be only 1 class in 1 sourse file 
//2) it should have the same class name as source file name or visa vesa 

//bcz
//when we resolve the same name file is resolve 
//in package envirnoment we can only mark public to same name file only

class A{
    public static void main(String[] args)
    {
        B x = new B();
        x.pro();
    }
}

// in starting we have 2 file 
// 1 A.java
// 2 B.java
// When we compile A.java
// Namaste is the output

// if we delete A.class and B.class
// and rename B.java to X.java
// So it will show error - 



// A.java:4: error: cannot find symbol
//         B x = new B();
//         ^
//   symbol:   class B
//   location: class A
// A.java:4: error: cannot find symbol
//         B x = new B();
//                   ^
//   symbol:   class B
//   location: class A
// 2 errors