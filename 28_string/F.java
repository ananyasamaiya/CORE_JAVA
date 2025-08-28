class F{
    public static void main(String[] args){
        String x = "             mohan kumar          ";
        String y = "mohan kumar          ";
        String z = "             mohan kumar";
    
        String a = x.trim();
        String b = y.trim();
        String c = z.trim();

        System.out.println(">"+x+"<");
        System.out.println(">"+a+"<");

        System.out.println(">"+y+"<");
        System.out.println(">"+b+"<");
        
        System.out.println(">"+z+"<");
        System.out.println(">"+c+"<");
    
    }
}