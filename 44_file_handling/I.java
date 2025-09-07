import java.io.File;
import java.io.IOException;

class I{
    public static void main(String[] args){
        File file = new File("C:/windows/system32/chotabheem.txt");
        
        System.out.println(file.exists());

        boolean flag = false;
        try{
            flag = file.createNewFile();
        } catch(IOException e){
            e.printStackTrace();
        }
        System.out.println("C:/windows/system32/chotabheem.txt created?: " + flag);
        System.out.println("~~~~~~~~~~~~~~~~~~~");
        System.out.println(file.exists());
    }
}

// false
// java.io.IOException: Access is denied
//         at java.base/java.io.WinNTFileSystem.createFileExclusively(Native Method)
//         at java.base/java.io.File.createNewFile(File.java:1043)
//         at I.main(I.java:12)
// C:/windows/system32/chotabheem.txt created?: false
// ~~~~~~~~~~~~~~~~~~~
// false