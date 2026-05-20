package Week3;

import java.util.Iterator;

public class StringExample implements Iterable<Character> {
    String data;

    public StringExample(String s) {
        this.data = s;

    }


    @Override
    public Iterator<Character> iterator() {
        return new IterExampleter();
    }



    private class IterExampleter implements Iterator<Character> {
        private int curIndex;

        public IterExampleter() {
            curIndex = 0;
        }

        @Override
        public boolean hasNext() {
            return curIndex < data.length();
        }

        @Override
        public Character next() {

            return data.charAt(curIndex++);
        }
    }


}
