package com.cv.scanner;

import java.util.*;

public class ParenthesesScanner {

    private Queue<Integer> data = new LinkedList<Integer>();

    public void add(Integer item) {
        this.data.add(item);
    }

    public void setData(Integer[] data) {
        for (Integer el: data) {
            this.add(el);
        }
    }

    public int getCount() {

        int result = 0;
        while (!data.isEmpty()) {
            int length = getBalancedBranchLengthForPart();
            if (length > result) result = length;
        }
        return result;
    }

    private int getBalancedBranchLengthForPart() {
        boolean isBalanced = true;
        int result = 0;
        Stack<Integer> queue = new Stack<Integer>();
        while (!data.isEmpty()) {

            if (queue.isEmpty() && result != 0) return result;

            Integer item = data.poll();

            if (queue.isEmpty() && item < 0) return 0;

            if (item > 0){
                queue.add(item);
                result++;
                continue;
            }

            if (item < 0 && queue.peek() != -item) {
                isBalanced = false;
                continue;
            }

            if (item < 0 && queue.peek() == -item) {
                queue.pop();
                result++;
            }
        }

        if (isBalanced && queue.isEmpty())
            return result;
        else
            return 0;
    }

}
