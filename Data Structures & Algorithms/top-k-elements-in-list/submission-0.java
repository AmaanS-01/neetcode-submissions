class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] arr=new int[k];
        HashMap<Integer,Integer> hmp=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int freq=0;
            if(hmp.containsKey(nums[i])){
                freq=hmp.get(nums[i]);
            }
            hmp.put(nums[i],++freq);
        }
       Queue<Integer> heap=new PriorityQueue<>((a,b)->hmp.get(b)-hmp.get(a));
        for(int i:hmp.keySet()){
            heap.add(i);
        }
        for(int i=0;i<k;i++){
            arr[i]=heap.poll();
        }
        return arr;
    }
}