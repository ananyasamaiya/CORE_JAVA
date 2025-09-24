class E{
    public static void main(String[] args){
        Class klass = EE.class;

        Class[] arr = klass.getClasses();

        for(Class next : arr){
            System.out.println(next.getName());
        } 
    }
}