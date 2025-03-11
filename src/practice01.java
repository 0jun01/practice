public class practice01 {
    public int[] solution(int[] num_list, int n) {
        int size = (num_list.length + n - 1) / n;
        int[] answer = new int[size];

        int index = 0;
        for (int i = 0; i <= num_list.length - 1; i += n) {
            answer[index++] = num_list[i];
        }

        return answer;
    }

    public static void main(String[] args) {

    }
}
