import java.util.Arrays;

public class practice01 {
    public static int[] solution(int[] num_list, int n) {
        int size = (num_list.length + n - 1) / n;
        int[] answer = new int[size];

        int index = 0;
        for (int i = 0; i <= num_list.length - 1; i += n) {
            answer[index++] = num_list[i];
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] da = new int[5];
        for (int i = 0; i < da.length - 1; i++) {
            da[i] = i;
        }

        int[] ds = solution(da,3);

        System.out.println(Arrays.toString(ds));
    }
}
