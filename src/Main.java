import javax.xml.transform.Source;
import java.util.Arrays; // Arrays.toString()을 사용하기 위해 필요
import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        int[] numbers = {10, 5, 8, 21, 3, 10, 5, 8};
        int answer2 = numbers[0];

        Set<Integer> answer = new HashSet<>();

        for (int i = 0 ; i <= numbers.length - 1 ; i++ ){
            if(numbers[i] > answer2){
                answer2 = numbers[i];
            }
        }

        for(int num : numbers){

            answer.add(num);
        }

        System.out.println(answer.toString());
        System.out.println(answer2);
    }
}
