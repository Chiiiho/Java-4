import java.util.List;

public class StreamQuiz1 {

    public static void main(String[] args) {
        List<String> names = List.of("Croatia", "Hungary", "Austria", "Czech Republic", "Germany");

        List<String> sortedResult = names.stream().sorted().toList();

        System.out.println(sortedResult);
    }
}
