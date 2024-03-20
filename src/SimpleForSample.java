import java.util.ArrayList;
import java.util.List;

public class SimpleForSample {

    public static void main(String[] args) {

        List<String> names = List.of("Croatia", "Hungary", "Austria", "Czech Republic", "Germany");
        List<String> result = new ArrayList<>();

        for (int i = 0; i < names.size(); i++) {
            if (names.get(i).contains("u")) {
                result.add(names.get(i));
            }
        }
        System.out.println(result);
    }
}
