
class I{
    public static void main(String[] args){
        for(int i=0; i<30; i++){
            System.out.println(java.util.UUID.randomUUID().toString().replace("-",""));
        }
    }
}