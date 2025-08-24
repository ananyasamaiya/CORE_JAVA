//we make multiple initialization block to divide a bulk code into section of code
//they are call in order they have written

class G{
    {
        System.out.println("H");
    }

    {
        System.out.println("T");
    }

    {
        System.out.println("A");
    }

    G() {
        System.out.println("D");
    }

    public static void main(String[] args){
        G x = new G();
    }
}