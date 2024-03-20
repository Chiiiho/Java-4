import java.util.List;

public class StreamQuiz2 {

    public static void main(String[] args) {
        List<String> names = List.of("Croatia", "Hungary", "Austria", "Czech Republic", "Germany");

        long count = names.stream().filter(name -> name.startsWith("C")).count();

        System.out.println(count);
    }
}
