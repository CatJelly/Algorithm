import java.util.stream.IntStream;
import java.util.*;

class Solution {
    public int[] solution(int n) {
        return IntStream.rangeClosed(1, n).filter(i -> i%2 == 1).toArray();
    }
}