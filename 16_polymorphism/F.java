class F{
    public static void main(String[] args){
        SpiderMan a = new SpiderMan();
        ShaktiMan b = new ShaktiMan();

        inviteForLunch(a);
        inviteForLunch(b);
        
    }

    static void inviteForLunch(SpiderMan x){
        System.out.println("Welcome");
        System.out.println("Serve Food");
    }
}

// F.java:4: error: cannot access ShaktiMan
//         ShaktiMan b = new ShaktiMan();
//         ^
//   bad source file: .\ShaktiMan.java
//     file does not contain class ShaktiMan
//     Please remove or make sure it appears in the correct subdirectory of the sourcepath.
// 1 error