package Week7;

public class Main {
    static void main(String[] args) {
        MyQueue q = new MyQueue(5);
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
//        System.out.println(q);
        q.enqueue(40);
        q.enqueue(50);
//        System.out.println(q);
//        System.out.println(q.peek());
        q.dequeue();
//        System.out.println(q);

//        MyStack s = new MyStack(5);
//        s.push(10);
//        s.push(20);
//        s.push(30);
//        System.out.println(s);
//        System.out.println(s.peek());
//        s.pop();
//        System.out.println(s);




//        QueueByStack qs = new QueueByStack(5);
//        qs.enqueue(10);
//        qs.enqueue(20);
//        qs.enqueue(30);
//        System.out.println(qs);
//        qs.dequeue();
//        System.out.println(qs);
//        qs.enqueue(40);
//        System.out.println(qs);
//        qs.dequeue();
//        System.out.println(qs);
//        System.out.println(qs.getSize());
//        qs.dequeue();
//        qs.dequeue();
//        System.out.println(qs);
//        qs.dequeue();


        int [] arr = {2,7,4,1,8,1};
        MaxHeap heap = new MaxHeap(arr);
        System.out.println(heap);

//        heap.insert(3);
//        heap.insert(10);
//        heap.insert(7);
//        heap.insert(5);
//        heap.insert(8);
//        heap.insert(1);
//        heap.insert(9);
//        System.out.println(heap);
//        heap.extractMax();
//        System.out.println(heap);
//        heap.insert(2);
//        System.out.println(heap);
//        heap.insert(11);
//        System.out.println(heap);
//        System.out.println(heap.peek());
//        heap.extractMax();
//        System.out.println(heap);
//        int [] arr = {7,4,10,2,5,8};
//        MaxHeap h = new MaxHeap(arr);
//        System.out.println(h);
//        h.extractMax();
//        System.out.println(h);




    }
}

