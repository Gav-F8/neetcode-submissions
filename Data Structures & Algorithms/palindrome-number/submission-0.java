class Solution {
    public boolean isPalindrome(int x) {
        Queue<Integer> queue = new LinkedList<>();
        int queueSize = -1;
        int res = 0;
        int count = x;
        while(count>0){ //Getting digits left to right, push them to stack AND recording stack height
            int digit = count%10;
            queue.add(digit); 
            count/=10;
            queueSize++;
        }
        while(!queue.isEmpty()){ //squaring digits and adding them to res, decrement stackHeight, pop stack and repeat until empty
            int digit = queue.poll();
            if(queueSize<1) res += digit;
            else res += digit*(Math.pow(10, queueSize));
            queueSize--;
        }
        if(res==x) return true;
        else return false;
    }
}