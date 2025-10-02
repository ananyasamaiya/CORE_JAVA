//this means current object use with instance context only(instance method, constructor, instiatition block
class A{
    void pro(){
        System.out.println(this);
    }

    {
        System.out.println(this);
    }

    A(){
        System.out.println(this);
    }
}