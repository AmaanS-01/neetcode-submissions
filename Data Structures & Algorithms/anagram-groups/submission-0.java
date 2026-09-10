class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
     List<List<String>> lst=new ArrayList<>();
     HashMap<String,List<String>> hmp=new HashMap<>();
     for(int i=0;i<strs.length;i++){
        char[] ch=strs[i].toCharArray();
        Arrays.sort(ch);
        String str=new String(ch);
        if(hmp.containsKey(str)){
            hmp.get(str).add(strs[i]);
        }
        else{
            List<String> temp=new ArrayList<>();
            temp.add(strs[i]);
            hmp.put(str,temp); 
        }
     }
     lst.addAll(hmp.values());
     return lst;    
    }
}
