import java.util.PriorityQueue;

class Z1 {
    public static void main(String[] args) {
        PriorityQueue<Integer> queue = new PriorityQueue<Integer>();

        queue.offer(78);
        queue.offer(23);
        queue.offer(54);
        queue.offer(12);
        queue.offer(67);
        queue.offer(39);

        System.out.println(queue);
        System.out.println("~~~~~~~~~~~~~~~~~");

        Object[] arr = queue.toArray();

        for(Object next : arr)
            System.out.print(next + "  ");
        
    }
}