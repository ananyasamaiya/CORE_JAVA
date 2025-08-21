class F2{
    public static void main(String[] args){
        SuperHuman a = new SpiderMan();
        SuperHuman b = new ShaktiMan();

        inviteForLunch(a);
        inviteForLunch(b);

        System.out.println(a instanceof SuperHuman);
        System.out.println(b instanceof SuperHuman);
        System.out.println(a instanceof SpiderMan);
        System.out.println(b instanceof ShaktiMan);
        
    }

    static void inviteForLunch(SuperHuman x){
        System.out.println("Welcome");
        System.out.println("Serve Food");
    }

//     static void inviteForLunch(SpiderMan x){
//         System.out.println("~~~~~~~~~~~~~~~~~~~~~");
//         System.out.println("Welcome");
//         System.out.println("Serve Food");
//     }

//     static void inviteForLunch(ShaktiMan x){
//         System.out.println("^^^^^^^^^^^^^^^^^^^^");
//         System.out.println("Welcome");
//         System.out.println("Serve Food");
//     }
 }