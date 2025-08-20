//interface can't have method defination only abstract method
interface C2{
    void pro(){

    }
    abstract void aaa();
    abstract void bbb();
    abstract void ccc();
}

// C2.java:3: error: interface abstract methods cannot have body
//     void pro(){
//               ^
// 1 error