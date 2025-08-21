class F1{
    public static void main(String[] args){
        SpiderMan a = new SpiderMan();
        ShaktiMan b = new ShaktiMan();

        inviteForLunch(a);
        inviteForLunch(b);
        
    }

    static void inviteForLunch(SpiderMan x){
        System.out.println("~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Welcome");
        System.out.println("Serve Food");
    }

    static void inviteForLunch(ShaktiMan x){
        System.out.println("^^^^^^^^^^^^^^^^^^^^");
        System.out.println("Welcome");
        System.out.println("Serve Food");
    }
}