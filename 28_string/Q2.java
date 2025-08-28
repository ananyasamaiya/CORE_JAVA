// java Q2 "mohan kumar" 25 89.67
class Q2{
    public static void main(String[] args){
        String name = "Vikram Singh";
        int age = 19;
        float marks = 91.34f;
        // String x ="My name is: " + args[0] + " and my age is: " + args[1] + " and my marks: " + args[2];

        String x = String.format("My name is: %s and my age: %d and my marks: %.2f",name, age, marks);
        System.out.println(x);
    }
}