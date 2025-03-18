import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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

    public int[] solution3(int[] num_list, int n) {
        int[] answer = new int[num_list.length - (n - 1)];

        for (int i = 0; i <= answer.length - 1; i++) {
            answer[i] = num_list[n - 1 + i];
        }
        return answer;
    }

    public int solution4(int[] num_list) {
        int answer = 0;

        for (int i = 0; i <= num_list.length - 1; i++) {
            if (num_list[i] < 0) {
                return i;
            }
        }

        return -1;
    }

    public static int[] solution5(int start_num, int end_num) {
        int[] answer = new int[start_num - end_num + 1];

        int index = 0;
        for (int i = start_num; i >= end_num; i--) {
            System.out.println(i);
            answer[index] = i;
            index++;

        }
        return answer;
    }

    public int[] solution6(int n, int k) {
        int size = n / k;
        int[] answer = new int[size];
        int min = 1;
        int index = 0;

        for (int i = n; i >= 1; i--) {
            if (i % k == 0) {
                answer[index] = i;
                index++;
            }
        }

        Arrays.sort(answer);
        return answer;
    }

    // 문자열의 뒤의 n글자
    public String solution(String my_string, int n) {
        String answer = "";

        answer = my_string.substring(my_string.length() - n);

        return answer;
    }

    // 부분 문자열 이어 붙여 문자열 만들기
    public String solution7(String[] my_strings, int[][] parts) {
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i <= my_strings.length - 1; i++) {
            int s = parts[i][0];
            int e = parts[i][1];

            builder.append(my_strings[i].substring(s, e));
        }

        return builder.toString();
    }

    // 글자 이어 붙여 문자열 만들기
    public String solution8(String my_string, int[] index_list) {
        StringBuilder builder = new StringBuilder();


        for (int i = 0; i < my_string.length(); i++) {
            builder.append(my_string.substring(index_list[i], index_list[i] + 1));
        }

        return builder.toString();
    }

    public int[] solution9(int n) {
        List<Integer> sequence = new ArrayList<>(); // 동적 배열 사용

        while (n != 1) {
            sequence.add(n); // 현재 값 저장
            if (n % 2 == 0) {
                n /= 2; // 짝수면 2로 나눔
            } else {
                n = 3 * n + 1;
            }
        }
        sequence.add(1); // 마지막 1 추가

        // 리스트를 int 배열로 변환하여 반환
        return sequence.stream().mapToInt(i -> i).toArray();
    }

    public int[] solution10(int start_num, int end_num) {
        int size = end_num - start_num + 1;
        int[] answer = new int[size];

        int index = 0;
        for (int i = start_num; i <= end_num; i++) {
            answer[index] = i;
            index++;
        }
        return answer;
    }

    public String solution11(String myString) {
        StringBuilder result = new StringBuilder();

        for (char c : myString.toCharArray()) {
            if (c < 'l') {
                result.append('l');
            } else {
                result.append(c);
            }
        }

        return result.toString();
    }

    public int solution12(String binomial) {
        int answer = 0;
        String[] str = binomial.split(" ");

        int a = Integer.parseInt(str[0]);
        String op = str[1];
        int b = Integer.parseInt(str[2]);
        ;

        if (op.equals("+")) {
            answer = a + b;
        } else if (op.equals("-")) {
            answer = a - b;
        } else {
            answer = a * b;
        }
        return answer;
    }

    public int solution12(int a, int b) {
        int answer = 0;

        if (a % 2 == 1 && b % 2 == 1) {
            answer = (a * a) + (b * b);
        } else if (a % 2 == 1 || b % 2 == 1) {
            answer = 2 * (a + b);
        } else {
            answer = Math.abs(a - b);
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] ad = solution5(5, 3);
        String my_String = "asd";

        Arrays.sort(ad);
        System.out.println(Arrays.toString(ad));
        // 시작 위치
        System.out.println(my_String.substring(1));
        // 포함 하는지
        System.out.println(my_String.endsWith("sd"));
        // 으로 시작하는지
        System.out.println(my_String.startsWith("a"));

        // 어떤 문자열에 대해서 접미사는 특정 인덱스부터 시작하는 문자열을 의미합니다. 예를 들어, "banana"의 모든 접미사는 "banana", "anana", "nana", "ana", "na", "a"입니다.
        String my_String2 = "banana";
        String[] answer = new String[my_String2.length()];

        for (int i = 0; i <= my_String2.length() - 1; i++) {
            answer[i] = my_String2.substring(i);
        }

        char a = 'a';
        System.out.println(a);

        Arrays.sort(answer);

        String asd = "45 + 13";
    }
}


