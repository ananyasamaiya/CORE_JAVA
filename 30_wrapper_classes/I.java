class I{
    public static void main(String[] args){
        Short a = Short.valueOf((short)127);
        Short b = Short.valueOf((short)127);
    
        Short c = Short.valueOf((short)128);
        Short d = Short.valueOf((short)128);

        System.out.println(a == b);    
        System.out.println(c == d);    
    
    }
}