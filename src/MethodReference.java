import java.util.List;

public class MethodReference {

    public static void main(String[] args) {

        List<String> names = List.of("Croatia", "Hungary", "Austria", "Czech Republic", "Germany");

        names.stream().map(String::toUpperCase).forEach(System.out::println);
    }
}
