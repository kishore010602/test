import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class stringOdd {
    public static void main(String[] args) {

        List<String> lengthFunction=new ArrayList<>();
        lengthFunction.add("John");
        lengthFunction.add("Ron");
        lengthFunction.add("James");
        lengthFunction.add("Joshua");
        List<String> newString=lengthFunction.stream().filter(s -> s.length()%2!=0).collect(Collectors.toList());
        System.out.println(newString);

    }
}
