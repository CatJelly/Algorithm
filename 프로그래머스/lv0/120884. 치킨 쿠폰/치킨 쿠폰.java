class Solution {
    public int solution(int chicken) {
        int answer = 0;

         while(true) {
            int service = chicken / 10;
            chicken = service + chicken % 10;
            answer += service;
            if(service == 0){
                break;
            }
        }

        return answer;
    }
}