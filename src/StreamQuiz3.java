import java.util.List;

public class StreamQuiz3 {

    public static void main(String[] args) {
        List<String> names = List.of("Croatia", "Hungary", "Austria", "Czech Republic", "Germany");

        boolean hasCountry = names.stream().anyMatch(name -> name.equals("Spain"));

        System.out.println(hasCountry);
    }
}
