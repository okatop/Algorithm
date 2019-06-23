package star;

import java.util.Arrays;

class test {

	 public static String solution(String[] participant, String[] completion) {
        String answer = "";
       
         Arrays.sort(participant);
         Arrays.sort(completion);
      
//        System.out.println(Arrays.toString(participant));
//        System.out.println(Arrays.toString(completion));
        
        for(int i=0;i<completion.length;i++)
        {
            if(participant[i] != completion[i])
                return participant[i];
        }
      
        return participant[participant.length - 1];
        
       // return answer;
    }
	
	
	public static void main(String[] args) {
		String[] participant = {"aaa", "bbb", "ccc"};
		String[] completion = {"aaa", "ccc"};
		
		solution(participant, completion);
		
	}
}
