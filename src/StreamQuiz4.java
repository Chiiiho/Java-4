import java.util.List;
import java.util.stream.Collectors;

public class StreamQuiz4 {

    public static void main(String[] args) {

        List<String> names = List.of("Croatia", "Hungary", "Austria", "Czech Republic", "Germany");

        List<String> result = names.stream().map(name -> name.toUpperCase()).collect(Collectors.toList());

        System.out.println(result);
    }
}
