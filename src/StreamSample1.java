import java.util.List;
import java.util.stream.Collectors;

public class StreamSample1 {

    public static void main(String[] args) {
        List<String> names = List.of("Croatia", "Hungary", "Austria", "Czech Republic", "Germany");
        List<String> result = names.stream()
                .filter(name -> name.contains("i"))
                .collect(Collectors.toList());

        System.out.println(result);
    }
}
