import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeList {
    String name;
    Integer id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public EmployeeList(String name, Integer id) {
        this.name = name;
        this.id = id;
    }

    public EmployeeList() {
    }

    @Override
    public String toString() {
        return "EmployeeList{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }

    public static void main(String[] args) {

        List<EmployeeList> employeeList=new ArrayList<EmployeeList>();
        employeeList.add(new EmployeeList("John",1));
        employeeList.add(new EmployeeList("Jacob",2));
        employeeList.add(new EmployeeList("Ram",3));
        employeeList.add(new EmployeeList("Shyam",4));
        employeeList.add(new EmployeeList("Vijay",5));
        System.out.println(employeeList);
        List<String> employeeName=employeeList.stream().map(EmployeeList-> EmployeeList.getName()).collect(Collectors.toList());
        System.out.println(employeeName);

    }
}


