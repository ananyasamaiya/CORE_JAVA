//class B have a ultimate parent class (Object) as a parent , these are object class method
//there are 11 method in Object class
// written by compiler class B extends Object

class B{
    public static void main(String[] args)
    {
        B a = new B();
        System.out.println(a.toString());
        System.out.println(a.hashCode());
    }
}