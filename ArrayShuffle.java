import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ShuffleArray {
    public static void main(String[] args) {
        Integer[] values = {1, 2, 3, 4, 5, 6, 7};

        List<Integer> list = Arrays.asList(values);
        Collections.shuffle(list);

        System.out.println(Arrays.toString(list.toArray()));
    }
}
