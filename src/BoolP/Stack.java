package BoolP;

public class Stack <T>{
    private LL<T> stack = new LL<>();

    public void push(T value){
        stack.addFirst(value);
    }

    public T pop(){
        return stack.removeFirst();
    }

    public Node<T> Top(){
        return stack.getHead();
    }

    public boolean isEmpty(){
        return stack.isEmpty();
    }
    public int size(){
        return stack.getSize();
    }

    public boolean isContains(Stack<T> stack , T val){
        Stack<T> temp = new Stack<>();
        boolean found =false;
        while (!stack.isEmpty()){
            T current = stack.pop();
            if (current == val){
                found = true;
            }
            temp.push(current);
        }
        while (!temp.isEmpty()){
            stack.push(temp.pop());
        }
        return found;
    }

    @Override
    public String toString(){
        return stack.toString();

    }
}
