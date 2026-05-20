package Recursion.jave;

import java.util.Iterator;

public class P1_arr implements Iterable<Integer> {
    private int[] data;


    public P1_arr(int [] n) {
        this.data = n;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new IterHelper();
    }


    private class IterHelper implements Iterator<Integer>{
        private int size;

        public IterHelper(){
            size = 0;
        }

        @Override
        public boolean hasNext() {
            return size < data.length;
        }

        @Override
        public Integer next() {

            return data[size++];
        }
    }

}
