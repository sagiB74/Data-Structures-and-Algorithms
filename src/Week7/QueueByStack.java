package Week7;

public class QueueByStack {
    private MyStack stack1;
    private MyStack stack2;
    int size;
    int capacity;

    public QueueByStack(int capacity){
        this.capacity = capacity;
        size = 0;
        this.stack1 = new MyStack(capacity);
        this.stack2 = new MyStack(capacity);

    }

    public int getSize(){
        return size;
    }

    public void enqueue(int value){
        if (stack1.isEmpty()){
            stack1.push(value);

        }else {
            for (int i = 0; !stack1.isEmpty(); i++){
                stack2.push(stack1.pop());
            }

            stack1.push(value);

            for (int j = 0; !stack2.isEmpty(); j++){
                stack1.push(stack2.pop());

            }

        }
        size++;

    }

    public int dequeue(){
        if (stack1.isEmpty()){
            throw new RuntimeException("queue is empty");
        }
        size--;
        return stack1.pop();

    }



    public boolean isEmpty(){
        return stack1.isEmpty();
    }

    public int peek(){
        return stack1.peek();
    }

    @Override
    public String toString(){
        return stack1.toString();
    }


}
