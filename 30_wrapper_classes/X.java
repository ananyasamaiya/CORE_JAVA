class X{
    public static void main(String[] args){
        Student a = new Student();

        System.out.println("toString(): " + a.toString());
        System.out.println("hashCode(): " + a.hashCode());

        String h = Integer.toHexString(a.hashCode());
        System.out.println(h);
    }
}

class Student{
    
}