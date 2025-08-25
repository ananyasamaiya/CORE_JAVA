//if we have a char array when we print it ref code will not be printed it will treat it as a string
class N{
    public static void main(String[] args){
        char[] x = {'m', 'a', 'n', 'o', 'j'};

        for(char next : x){
            System.out.println(next);
        }

        System.out.println("~~~~~~~~~~~~~");

        System.out.println(x);
    }
}