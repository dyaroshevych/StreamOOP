import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlattingTask {
    public static List<String> flattingStrings(List<String> list) {
        return list.stream().flatMap(item -> Arrays.stream(item.split(""))).collect(Collectors.toList());
    }
}