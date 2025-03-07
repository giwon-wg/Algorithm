class Solution {
    public int[] solution(int[] arr) {
        
        int min = arr[0];
        if(arr.length == 1){
            int[] answer = {-1};
            return answer;
        } else{
            int[] answer = new int[arr.length -1];
            for(int i = 1; i < arr.length; i++){
               if(arr[i] < min){
                    min = arr[i];
                }
           }
            int val = 0;
            for(int i = 0; i < arr.length; i++){
              if(min == arr[i]){
                  continue;
            } else{
                  answer[val++]= arr[i];
              }
            }
            return answer;
        }
    }
}