class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer> hmp=new HashMap<>();
        if(s.length()!=t.length()){
            return false;
        }
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            hmp.put(ch,hmp.getOrDefault(ch,0)+1);
        }
        for(int i=0;i<t.length();i++){
            char ch=t.charAt(i);
            hmp.put(ch,hmp.getOrDefault(ch,0)-1);
        }
        for(int n:hmp.values()){
            if(n!=0){
                return false;
            }
        }
        return true;

        }
    }
