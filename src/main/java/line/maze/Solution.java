package line.maze;

public class Solution{

    public String[] solution(int n, int[] arr1, int[] arr2){
        String[] answer = new String[n];
        for(int i = 0; i < arr1.length; i++){
            answer[i] = String.format(
                "%0" + n + "d", 
                Integer.parseInt(
                Integer.toBinaryString(
                    arr1[i]|arr2[i]
                ))).replace("0", " ").replace("1","#");
        }
        
        return answer;
    }

}