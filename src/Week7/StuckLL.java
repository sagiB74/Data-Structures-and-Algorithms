package Week7;

import java.util.LinkedList;
import java.util.List;

public class StuckLL<T> {
    private List<T> data;

    public StuckLL() {
        data = new LinkedList<T>();
    }

    public boolean isEempty() {
        return data.isEmpty();
    }

    public int size() {
        return data.size();
    }

    public boolean push(T value) {
        return data.add(value);
    }

    public T pop() {
        return data.remove(data.size() - 1);
    }

    public T peek() {
        return data.get(data.size() - 1);
    }

    public String toString() {
        return data.toString();
    }
}
