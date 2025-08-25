class I{
    public static void main(String[] args){
        Student[] x = new Student[3];
        x[0] = new Student("mohan", 12);
        x[1] = new Student("om", 6);
        x[2] = new Student("ram", 22);

        System.out.println(x[1].name);
        System.out.println(x[2].age);
    }
}