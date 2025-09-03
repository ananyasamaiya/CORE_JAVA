import java.util.LinkedList;

class B{
    public static void main(String[] args){
        //As as Queue
        LinkedList<String> list = new LinkedList<String>();

        System.out.println(list);

        list.offer("mohan");
        list.offer("raj");
        list.offer("mukund");
        list.offer("neelesh");
        list.offer("ratan");

        System.out.println(list);

        System.out.println(list.peek());
        System.out.println(list.peek());
        System.out.println(list.peek());
        System.out.println(list.peek());
        System.out.println(list.peek());
        
        System.out.println(list);

        System.out.println(list.poll());
        System.out.println(list.poll());
        System.out.println(list.poll());
        System.out.println(list.poll());
        System.out.println(list.poll());

        System.out.println(list);

    }
}