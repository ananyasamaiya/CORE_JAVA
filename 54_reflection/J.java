import java.lang.reflect.Field;

class J {
    public static void main(String[] args) {
        Class klass = Student.class;

        Field[] arr = klass.getFields();

        for(Field field : arr)
            System.out.println(field.getName());
    }
}