class E1{
    public static void main(String[] args){
        Animal[] arr = new Animal[5];

        arr[0] = new Animal();
        arr[1] = new Dog();
        arr[2] = new Cat();
        arr[3] = new Cow();
        arr[4] = new BDog();

        for(LivingBeing next : arr)
            System.out.println(next);
    }
}