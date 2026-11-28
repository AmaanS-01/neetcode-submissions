class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> st=new Stack<>();
        for(String s:operations){
            if(s.equals("+")){
                int a=st.pop();
                int b=st.peek();
                st.push(a);
                st.push(a+b);
            }
            else if(s.equals("D")){
                int a=st.peek();
                st.push(2*a);
            }
            else if(s.equals("C")){
                st.pop();
            }
            else{
                int a =Integer.parseInt(s);
                st.push(a);
            }
        }
        int sum=0;
        for(int a:st){
            sum+=a;
        }
        return sum;
    }
}