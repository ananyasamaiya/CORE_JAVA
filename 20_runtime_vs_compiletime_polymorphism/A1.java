/*
if we do not write pro(char a) method it will run because char is 2 byte and int is 4 byte so we can store small value into container

Widenning conversion

storing small value into huge container
*/

class A1{
    // static void pro(char a){
    //     System.out.println(a + "--------char");
    // }

    static void pro(int a){
        System.out.println(a + "-------int");
    }

    static void pro(float a){
        System.out.println(a + "--------float");
    }

    public static void main(String[] args){
        pro(44);  //ok
        pro(4.5f);  //ok
        pro('A');  //ok
    }
}