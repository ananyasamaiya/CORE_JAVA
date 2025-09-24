class F {
    public static void main(String[] args) {
        Class klass = EE.class;

        Class[] arr = klass.getDeclaredClasses();

        for(Class next : arr)
            System.out.println(next.getName());
    }    
}