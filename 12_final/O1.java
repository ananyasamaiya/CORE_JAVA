// from all, the modifier local variable can only be marked final
//Charactertics of local variable

//default value is only for member variable (variable made directly in class)
// not for local level variable

// in java -> local variable is not assign
// any default value or any garbage value


// WE can make unintialized variable but can't access them before initializtion
class O1{
    void pro(){
        int e;  //uninitialized variable
        int w = 9;

        System.out.println(e);
        System.out.println(w);
    }
    public static void main(String[] args)
    {
        O1 a = new O1();

        a.pro();
    }
} 

// O1.java:17: error: variable e might not have been initialized
//         System.out.println(e);
//                            ^
// 1 error