import java.io.File;

class A{
    public static void main(String[] args){
        File file = new File("C");
        deletingFile(file);
    }
    public static void deletingFile(File file){
        if(file.isFile())
            file.delete();
        else if(file.isDirectory())
            deleteDirectory(file);
    }
    public static void deleteDirectory(File file){
        if(isDirectoryEmpty(file)){
            file.delete();
        }
        else{
            File[] arr = file.listFiles();
            for(File f : arr){
                deletingFile(f);
            }
            file.delete();
        }
    }
    public static boolean isDirectoryEmpty(File file){
        String[] arr = file.list();
        if(arr.length == 0)
            return true;
        else
            return false;
    }
}