// in case of local variable they are not initialized by any default value 
// when we do not initialized them

// So we can initialized it one time ONLY ONE TIME
//As we can initialized final variable but can't reinitialized them

//remember do not access before initializing


class Q{
    public static void main(String[] args)
    {
        final int j; //uninitialized variable

        j = 29;

        System.out.println(j);
    }
}