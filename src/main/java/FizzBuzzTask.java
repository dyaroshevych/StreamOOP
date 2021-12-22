import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FizzBuzzTask {
    private static String fizzBuzzItem(int item) {
        if (item % 15 == 0) {
            return "FizzBuzz";
        }
        if (item % 3 == 0) {
            return "Fizz";
        }
        if (item % 5 == 0) {
            return "Buzz";
        }
        return Integer.toString(item);
    }

    public static List<String> fizzBuzzIt(int num) {
        return IntStream.range(0, num).mapToObj(item -> fizzBuzzItem(item)).collect(Collectors.toList());
    }
}
