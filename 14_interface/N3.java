//prove interface method is public

interface Y5{
   /*public abstract*/ void pro();
   //interface method are implicitly public abstract
}

class N3 implements Y5{
    public void pro(){
    //you must define such inherited method inside your implimentor class
    }
}
