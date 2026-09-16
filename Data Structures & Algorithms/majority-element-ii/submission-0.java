class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer,Integer> hmp=new HashMap<>();
        for(int num:nums){
            if(hmp.containsKey(num)) hmp.put(num,hmp.get(num)+1);
            else hmp.put(num,1);
        }
        PriorityQueue<Integer> heap=new PriorityQueue<>((a,b)->hmp.get(b)-hmp.get(a));
        for(int num:hmp.keySet()){
            heap.add(num);
        }
        List<Integer> lst=new ArrayList<>();
        for(int num:heap){
            if(hmp.get(num)>nums.length/3) lst.add(num);
        }
        return lst;
    }
}