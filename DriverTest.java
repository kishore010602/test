import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class DriverTest {
    public static void main(String[] args) {
        List<String> nameList=new ArrayList<>();
        nameList.add("Ford");
        nameList.add("Maruthi");
        nameList.add("Hyundai");
        nameList.add("BMW");
        //System.out.println(nameList);
        nameList.stream().map((s)->s.toUpperCase()).forEach((s)-> System.out.println(s));
        //System.out.println(nameList);
        //Print length of all names
        nameList.stream().map((s)->s.length()).forEach((s)-> System.out.println(s));
        //filter out names with length less than 5
        nameList.stream().filter((s)->s.length()<5).forEach(s -> System.out.println(s));
        //Sort
        nameList.stream().sorted().forEach(s-> System.out.println(s));
        //Reduce
        //nameList.clear();
        Optional<Integer> totalLen=nameList.stream().map(s->s.length()).reduce((a,b)->a+b);

        if(totalLen.isPresent()){
            System.out.println(totalLen.get());
        }
        else{
            System.out.println("Empty");
        }
    //Limit
        nameList.stream().limit(2).forEach(s->System.out.println(s));
        //min and max function
        List<Integer> salaryList=new ArrayList<>();
        salaryList.add(10000);
        salaryList.add(11500);
        salaryList.add(12500);
        Optional<Integer> minOpt=salaryList.stream().min((e1,e2)->e1.compareTo(e2));
        if(minOpt.isPresent()){
            System.out.println(minOpt.get());
        }
        List<String> filterList=nameList.stream().filter((s)->s.length()<5).collect(Collectors.toList());
        System.out.println(filterList);
    }
}
