import java.util.LinkedList;

class A{
    public static void main(String[] args){
        //As as List
        LinkedList<String> list = new LinkedList<String>();

        System.out.println(list);

        list.add("mohan");
        list.add("raj");
        list.add("mukund");
        list.add("neelesh");
        list.add("ratan");

        System.out.println(list);

        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));
        System.out.println(list.get(3));
        System.out.println(list.get(4));
        
        System.out.println(list);

        System.out.println(list.remove(0));
        System.out.println(list.remove(0));
        System.out.println(list.remove(0));
        System.out.println(list.remove(0));
        System.out.println(list.remove(0));

        System.out.println(list);

    }
}