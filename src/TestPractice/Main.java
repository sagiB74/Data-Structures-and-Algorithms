package TestPractice;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {73,74,75,71,69,72,76,73};
        int[] arr2 = {4,5,2,10,8};
        int[] arr3 = {100,80,60,70,60,75,85};
        int[] arr4 = {10,10,10,10,10};
//        NearestSmall solver = new NearestSmall();
//        System.out.println(Arrays.toString(solver.NearestSmallCalc(arr2)));
//        TempHistogram t = new TempHistogram();
//        System.out.println(Arrays.toString(t.TempCalc(arr)));
//        StockSeq stockSeq = new StockSeq();
//        System.out.println(Arrays.toString(stockSeq.stockCalc(arr3)));

        Histo2 solver = new Histo2();
        System.out.println(solver.HistoCalc(arr4));

//        TwoSideQueue queue = new TwoSideQueue(4);
//        queue.addFirst(1);
//        queue.addFirst(2);
//        queue.addFirst(3);
//        queue.addFirst(4);
//        System.out.println(queue);
//        System.out.println(queue.removeFirst());

    }


}

