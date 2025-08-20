//There is no parent child relation between Object class and interface
// x is local variable it is not initialized so it not given any default value

interface JJ{

}

class Q{
    public static void main(String[] args){
        JJ a;

        System.out.println(a instanceof Object);  
    }
}

// Q.java:12: error: variable a might not have been initialized
//         System.out.println(a instanceof Object);
//                            ^
// 1 error
