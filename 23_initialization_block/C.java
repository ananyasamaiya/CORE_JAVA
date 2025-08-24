/*
when we call constructor
1) super();
2) deal with instance level component
   i)variable -> memory allocated
   ii)method -> register
   iii)initialized block -> execute(call)
3) rest of code 

*/

class C{
    {
        System.out.println("namaste");
    }
    public static void main(String[] args){
        System.out.println("start-main");

        C x = new C();
        C y = new C();
        C z = new C();

        System.out.println("end-main");
    }
}