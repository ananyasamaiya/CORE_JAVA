import java.io.File;
class G1{
    public static void main(String[] args){
        File file = new File("E:\movies\mohan.txt");

        boolean flag = file.exists();

        System.out.println("E:/movies/mohan.txt exists?: " + flag);
    }
}

// G1.java:4: error: illegal escape character
//         File file = new File("E:\movies\mohan.txt");
//                                  ^
// G1.java:4: error: illegal escape character
//         File file = new File("E:\movies\mohan.txt");
//                                         ^
// 2 errors