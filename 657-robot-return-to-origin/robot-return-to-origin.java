class Solution {
    public boolean judgeCircle(String moves) {
        int ucnt=0,dcnt=0,lcnt=0,rcnt=0;
        char[] arr=moves.toCharArray();
        int n= arr.length;
        for(int i=0;i<n;i++){
            if(arr[i]=='U'){
                ucnt++;
            }
            if(arr[i]=='D'){
                dcnt++;
            }
            if(arr[i]=='R'){
                rcnt++;
            }
            if(arr[i]=='L'){
                lcnt++;
            }
        }
        if(ucnt==dcnt && rcnt==lcnt){
            return true;
        }
        return false;
    }
}