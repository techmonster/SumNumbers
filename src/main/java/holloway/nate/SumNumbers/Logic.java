package holloway.nate.SumNumbers;

/**
 * Created by nathanielholloway on 9/12/16.
 */
public class Logic {

    public int sumAllNumbers(int number){
        int answer = 0;
        for (int i = 0; i <= number; i++) {
            answer += i;
        }
        return answer;
    }
}
