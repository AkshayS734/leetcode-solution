import java.util.PriorityQueue;

public class TakeGiftsFromRichestPile {
    public long pickGifts(int[] gifts, int k) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a, b) -> b - a);
        for (int value : gifts){
            maxHeap.offer(value);
        }
        while (k--> 0 && !maxHeap.isEmpty()){
            int highestValue = maxHeap.poll();
            maxHeap.offer((int) Math.sqrt(highestValue));
        }
        long res = 0;
        for (int num : maxHeap) {
            res += num;
        }
        return res;
    }
}
