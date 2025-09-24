import java.lang.reflect.Field;

class K {
    public static void main(String[] args) {
        Class klass = Student1.class;

        Field[] arr = klass.getDeclaredFields();

        for(Field field : arr)
            System.out.println(field.getName());
    }
}