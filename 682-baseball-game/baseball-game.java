class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> st=new Stack<>();
        for(String s:operations){
		    if(s.equals("C") || s.equals("D") || s.equals("+")){
		        if(s.equals("C")){
		            st.pop();
		        }
		        if(s.equals("D")){
		            st.push(st.peek()*2);
		        }
		        if(s.equals("+")){
		            int a = st.pop();
                    int b = st.peek();
                    st.push(a); 
                    st.push(a + b);  
		        }
		    }
		    else{
		        st.push(Integer.parseInt(s));
		    }
		}
		int sum = 0;
        for (int x : st) {
            sum += x;
        }
        return sum;
    }
}