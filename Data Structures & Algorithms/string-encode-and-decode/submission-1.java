class Solution {
    String st="";
    public String encode(List<String> strs) {
        for(String str:strs){
            int len=str.length();
            st=st+len+'#'+str;
        }
        return st;
    }

    public List<String> decode(String str) {
        List<String> lst=new ArrayList<>();
        int i=0;
        while(i<str.length()){
            int j=str.indexOf('#',i);
            int n=Integer.parseInt(str.substring(i,j));
            i=j+1;
            String s=str.substring(i,i+n);
            lst.add(s);
            i=i+n;
            
            
        }
        return lst;
    }
}
