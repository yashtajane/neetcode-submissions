class MedianFinder {
    ArrayList<Integer>d;
    public MedianFinder() {
        d=new ArrayList<>();
    }
    
    public void addNum(int num) {
        d.add(num);
    }
    
    public double findMedian() {
        Collections.sort(d);
        int i = d.size();
        if((i&1)==1){
            return d.get(i/2);
        }
        else{
            return ((d.get(i/2)+d.get((i/2)-1))/2.0);
        }
    }
}
