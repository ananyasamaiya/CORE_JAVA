import java.io.FileReader;

class YY{
    YY(){
        FileReader fr = new FileReader("abc.txt");
    }
}

class Z extends YY{
    Z(){

    }

    public static void main(String[] args){
        System.out.println("A");

        Z a = new Z();
        System.out.println("B");
    }
}

// Z.java:5: error: unreported exception FileNotFoundException; must be caught or declared to be thrown
//         FileReader fr = new FileReader("abc.txt");
//                         ^
// 1 error
