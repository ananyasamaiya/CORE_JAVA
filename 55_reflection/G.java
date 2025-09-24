class G{
    public static void main(String[] args){
        Class klass = EE.D.class;

        Class kl = klass.getEnclosingClass();

        System.out.println(kl.getName());
    }
}