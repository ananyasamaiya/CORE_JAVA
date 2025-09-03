class Q {
    public static void main(String[] args) {
        Employee1 x = new Employee1("mohan", 12);
        Employee1 y = new Employee1("mohan", 12);
        Employee1 z = new Employee1("mohan", 12);
        
        System.out.println(x.hashCode());
        System.out.println(y.hashCode());
        System.out.println(z.hashCode());



    }    
}