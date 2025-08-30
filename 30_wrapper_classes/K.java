class K{
    public static void main(String[] args){
        Character a = Character.valueOf((char)127);
        Character b = Character.valueOf((char)127);
    
        Character c = Character.valueOf((char)128);
        Character d = Character.valueOf((char)128);

        System.out.println(a == b);    
        System.out.println(c == d);    
    
    }
}