import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ElementCounter {
    public static Map<Integer, Integer> countElements(List<Integer> list) {
        Map<Integer, Integer> elementCount = new HashMap<>();
        for (Integer element : list) {
            elementCount.put(element, elementCount.getOrDefault(element, 0) + 1);
        }
        return elementCount;
    }

    public static void main(String[] args) {
        List<Integer> list = List.of(1, 3, 4, 5, 1, 5, 4);
        System.out.println(countElements(list));
    }
}
