//There is no parent child relation between Object class and interface
// x is local variable it is not initialized so it not given any default value

interface JJ1{

}

class Q1{
    public static void main(String[] args){
        JJ1 a = null;

        System.out.println(a instanceof Object);  //false
    }
}