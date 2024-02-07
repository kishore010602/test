import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class numberStream {
    public static void main(String[] args) {
        List<Integer> numbers=new ArrayList<>();
        numbers.add(11);
        numbers.add(12);
        numbers.add(13);
        numbers.add(14);
        List<Integer> filteredList=numbers.stream().filter(s->s%2!=0).collect(Collectors.toList());
        System.out.println(filteredList);
    }
}
