class Solution {
    public int findMaximizedCapital(int k, int w, int[] profits, int[] capital) {
        PriorityQueue<int[]>minH = new PriorityQueue<>((a,b)->a[0]-b[0]);
        PriorityQueue<Integer>maxH = new PriorityQueue<>((a,b)->b-a);
        for(int i = 0 ; i<capital.length ;i++){
          minH.offer(new int[]{capital[i],profits[i]});
        }
        for(int i = 0 ; i<k ;i++){
            while(!minH.isEmpty() && minH.peek()[0]<=w){
                maxH.offer( minH.poll()[1]);
            }
            if(maxH.isEmpty()) break ;
             w+= maxH.poll();
             
        }
          return w;
    }
}