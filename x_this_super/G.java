/*
priority id given to
1) local variable
2)own member
3)parent member
*/
class X1{
    int y = 56;
}
class G extends X1{
    int y = 99;
    public static void main (String[] args){
        G a = new G();
        a.pro();
    }
    void pro(){
        int y = 2;
        System.out.println(y);
        System.out.println(this.y);
        System.out.println(super.y);
    }
}