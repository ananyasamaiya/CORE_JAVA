import java.lang.reflect.Field;

class L {
    public static void main(String[] args) {
        Class klass =Student1.class;

        Field[] arr = klass.getDeclaredFields();

        for(Field next : arr)
            System.out.println(next.getType().getName() + " " + next.getName());
    }    

}