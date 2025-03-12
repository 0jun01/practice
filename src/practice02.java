public class practice02 {
    // 정수 리스트 num_list와 정수 n이 주어질 때, num_list의 첫 번째 원소부터 n 번째 원소까지의 모든 원소를 담은 리스트를 return하도록 solution 함수를 완성해주세요.

    public int[] solution(int[] num_list, int n) {
        int[] answer = new int[n];

        for (int i = 0; i <= n - 1; i++) {
            answer[i] = num_list[i];
        }

        return answer;
    }

    public int[] solution2(int[] num_list, int n) {
        int[] answer = new int[num_list.length];  // 배열 크기를 올바르게 설정

        for (int i = 0; i < num_list.length; i++) { // i 범위 수정
            answer[i] = num_list[(n + i) % num_list.length]; // 인덱스 조정
        }

        return answer;
    }
}


